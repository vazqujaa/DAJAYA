using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using MySql.Data.MySqlClient;
using MySql;

namespace dajaya
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            String datos = "datasource=localhost;port=3306;user=root;password=;database=dajaya;";
            String query = "select * from dajaya";
            MySqlConnection conexion = new MySqlConnection(datos);
            
            
            conexion.Open();
            MySqlCommand SELECT = new MySqlCommand ();

            MySqlConnection entrar = new MySqlConnection();

            SELECT.Connection = conexion;

            SELECT.CommandText = ("select * from usuarios where usuario = '" + textBox1.Text + "' and password = '" + textBox2.Text + "'");
            MySqlDataReader leer = SELECT.ExecuteReader();
            if (leer.Read())
            {
                MessageBox.Show("Sesión Iniciada");

                menu obj = new menu();
                obj.Show();
                this.Hide();
            }
            else
            {
                MessageBox.Show("Error en la conexion");
            }
            conexion.Close();
        }
    }
}
