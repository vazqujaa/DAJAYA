using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using MySql.Data.MySqlClient;
using MySql.Data;

namespace dajaya
{
    public partial class menu : Form
    {
        public menu()
        {
            InitializeComponent();
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void panel2_Paint(object sender, PaintEventArgs e)
        {
            String datos = "datasource=localhost;port=3306;user=root;password=;database=dajaya;";
            String query = "SELECT destinos FROM destinos;";

            MySqlConnection conexion = new MySqlConnection(datos);
            MySqlDataAdapter SELECT = new MySqlDataAdapter(query, conexion);
            conexion.Open();

            DataGridViewCheckBoxColumn tabla = new DataGridViewCheckBoxColumn(); 
            SELECT.Fill(tabla);
            destino.DataSource = tabla;
            conexion.Close();
        }
    }
}
