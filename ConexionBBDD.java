import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase para manejar las conexiones y consultas a la base de datos.
 */

public class ConexionBBDD {
   
    // Configuración de la conexión a la base de datos MySQL
    String url = "jdbc:mysql://localhost:3306/practica_intermodular";
    String usuario = "root";
    String contraseña = "Med@c";
   
    // Sentencias SQL    
    String sqlMarte = "SELECT * FROM Planetas WHERE nombre = 'Marte' ";
   
     /**
     * Conecta a la base de datos y consulta los datos del planeta Marte.
     *
     * @return Un array con los datos del planeta Marte.
     */
   
    //Métodos para conectar y consultar
    public String[] conectarConsultarMarte(){
        //1. Crear array
        String[] datosMarte = new String[7];
       
        try{
        //2. Conectarme
        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
        Statement statement = conexion.createStatement();
        //3. Lanzar query
        ResultSet resultados = statement.executeQuery(sqlMarte);
        //4. Recoger datos y guardar en array
        while (resultados.next()) {
            datosMarte[0] = resultados.getString("Radio");
            datosMarte[1] = resultados.getString("Nombre");
            datosMarte[2] = resultados.getString("Distancia_Media_Sol");
            datosMarte[3] = resultados.getString("Periodo_Orbital");
            datosMarte[4] = resultados.getString("Temperatura_Media");
            datosMarte[5] = resultados.getString("Tipo");
            datosMarte[6] = resultados.getString("Num_Satelites");
            datosMarte[7] = resultados.getString("Fecha_Creacion");
        }
        //5. Cerrar conexion
        resultados.close();
        statement.close();
        conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //6. return array
        return datosMarte;
    }
   
      /**
     * Conecta a la base de datos y consulta los datos del planeta Mercurio.
     *
     * @return Un array con los datos del planeta Mercurio.
     */
    // Sentencias SQL    
    String sqlMercurio = "SELECT * FROM Planetas WHERE nombre = 'Mercurio' ";
   
    //Métodos para conectar y consultar
    public String[] conectarConsultarMercurio(){
        //1. Crear array
        String[] datosMercurio = new String[7];
       
        try{
        //2. Conectarme
        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
        Statement statement = conexion.createStatement();
        //3. Lanzar query
        ResultSet resultados = statement.executeQuery(sqlMercurio);
        //4. Recoger datos y guardar en array
        while (resultados.next()) {
            datosMercurio[0] = resultados.getString("Radio");
            datosMercurio[1] = resultados.getString("Nombre");
            datosMercurio[2] = resultados.getString("Distancia_Media_Sol");
            datosMercurio[3] = resultados.getString("Periodo_Orbital");
            datosMercurio[4] = resultados.getString("Temperatura_Media");
            datosMercurio[5] = resultados.getString("Tipo");
            datosMercurio[6] = resultados.getString("Num_Satelites");
            datosMercurio[7] = resultados.getString("Fecha_Creacion");
        }
        //5. Cerrar conexion
        resultados.close();
        statement.close();
        conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //6. return array
        return datosMercurio;
    }
   
      /**
     * Conecta a la base de datos y consulta los datos del planeta Venus.
     *
     * @return Un array con los datos del planeta Venus.
     */
     // Sentencias SQL    
    String sqlVenus = "SELECT * FROM Planetas WHERE nombre = 'Venus' ";
   
    //Métodos para conectar y consultar
    public String[] conectarConsultarVenus(){
        //1. Crear array
        String[] datosVenus = new String[7];
       
        try{
        //2. Conectarme
        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
        Statement statement = conexion.createStatement();
        //3. Lanzar query
        ResultSet resultados = statement.executeQuery(sqlVenus);
        //4. Recoger datos y guardar en array
        while (resultados.next()) {
            datosVenus[0] = resultados.getString("Radio");
            datosVenus[1] = resultados.getString("Nombre");
            datosVenus[2] = resultados.getString("Distancia_Media_Sol");
            datosVenus[3] = resultados.getString("Periodo_Orbital");
            datosVenus[4] = resultados.getString("Temperatura_Media");
            datosVenus[5] = resultados.getString("Tipo");
            datosVenus[6] = resultados.getString("Num_Satelites");
            datosVenus[7] = resultados.getString("Fecha_Creacion");
        }
        //5. Cerrar conexion
        resultados.close();
        statement.close();
        conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //6. return array
        return datosVenus;
    }
   
      /**
     * Conecta a la base de datos y consulta los datos del planeta Tierra.
     *
     * @return Un array con los datos del planeta Tierra.
     */
    // Sentencias SQL    
    String sqlTierra = "SELECT * FROM Planetas WHERE nombre = 'Tierra' ";
   
    //Métodos para conectar y consultar
    public String[] conectarConsultarTierra(){
        //1. Crear array
        String[] datosTierra = new String[7];
       
        try{
        //2. Conectarme
        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
        Statement statement = conexion.createStatement();
        //3. Lanzar query
        ResultSet resultados = statement.executeQuery(sqlTierra);
        //4. Recoger datos y guardar en array
        while (resultados.next()) {
            datosTierra[0] = resultados.getString("Radio");
            datosTierra[1] = resultados.getString("Nombre");
            datosTierra[2] = resultados.getString("Distancia_Media_Sol");
            datosTierra[3] = resultados.getString("Periodo_Orbital");
            datosTierra[4] = resultados.getString("Temperatura_Media");
            datosTierra[5] = resultados.getString("Tipo");
            datosTierra[6] = resultados.getString("Num_Satelites");
            datosTierra[7] = resultados.getString("Fecha_Creacion");
        }
        //5. Cerrar conexion
        resultados.close();
        statement.close();
        conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //6. return array
        return datosTierra;
    }
      /**
     * Conecta a la base de datos y consulta los datos del planeta Jupiter.
     *
     * @return Un array con los datos del planeta Jupiter.
     */
    // Sentencias SQL    
    String sqlJupiter = "SELECT * FROM Planetas WHERE nombre = 'Jupiter' ";
   
    //Métodos para conectar y consultar
    public String[] conectarConsultarJupiter(){
        //1. Crear array
        String[] datosJupiter = new String[7];
       
        try{
        //2. Conectarme
        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
        Statement statement = conexion.createStatement();
        //3. Lanzar query
        ResultSet resultados = statement.executeQuery(sqlJupiter);
        //4. Recoger datos y guardar en array
        while (resultados.next()) {
            datosJupiter[0] = resultados.getString("Radio");
            datosJupiter[1] = resultados.getString("Nombre");
            datosJupiter[2] = resultados.getString("Distancia_Media_Sol");
            datosJupiter[3] = resultados.getString("Periodo_Orbital");
            datosJupiter[4] = resultados.getString("Temperatura_Media");
            datosJupiter[5] = resultados.getString("Tipo");
            datosJupiter[6] = resultados.getString("Num_Satelites");
            datosJupiter[7] = resultados.getString("Fecha_Creacion");
        }
        //5. Cerrar conexion
        resultados.close();
        statement.close();
        conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //6. return array
        return datosJupiter;
    }
   
      /**
     * Conecta a la base de datos y consulta los datos del planeta Saturno.
     *
     * @return Un array con los datos del planeta Saturno.
     */
    // Sentencias SQL    
    String sqlSaturno = "SELECT * FROM Planetas WHERE nombre = 'Saturno' ";
   
    //Métodos para conectar y consultar
    public String[] conectarConsultarSaturno(){
        //1. Crear array
        String[] datosSaturno = new String[7];
       
        try{
        //2. Conectarme
        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
        Statement statement = conexion.createStatement();
        //3. Lanzar query
        ResultSet resultados = statement.executeQuery(sqlSaturno);
        //4. Recoger datos y guardar en array
        while (resultados.next()) {
            datosSaturno[0] = resultados.getString("Radio");
            datosSaturno[1] = resultados.getString("Nombre");
            datosSaturno[2] = resultados.getString("Distancia_Media_Sol");
            datosSaturno[3] = resultados.getString("Periodo_Orbital");
            datosSaturno[4] = resultados.getString("Temperatura_Media");
            datosSaturno[5] = resultados.getString("Tipo");
            datosSaturno[6] = resultados.getString("Num_Satelites");
            datosSaturno[7] = resultados.getString("Fecha_Creacion");
        }
        //5. Cerrar conexion
        resultados.close();
        statement.close();
        conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //6. return array
        return datosSaturno;
    }
   
      /**
     * Conecta a la base de datos y consulta los datos del planeta Urano.
     *
     * @return Un array con los datos del planeta Urano.
     */
    // Sentencias SQL    
    String sqlUrano = "SELECT * FROM Planetas WHERE nombre = 'Urano' ";
   
    //Métodos para conectar y consultar
    public String[] conectarConsultarUrano(){
        //1. Crear array
        String[] datosUrano = new String[7];
       
        try{
        //2. Conectarme
        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
        Statement statement = conexion.createStatement();
        //3. Lanzar query
        ResultSet resultados = statement.executeQuery(sqlUrano);
        //4. Recoger datos y guardar en array
        while (resultados.next()) {
            datosUrano[0] = resultados.getString("Radio");
            datosUrano[1] = resultados.getString("Nombre");
            datosUrano[2] = resultados.getString("Distancia_Media_Sol");
            datosUrano[3] = resultados.getString("Periodo_Orbital");
            datosUrano[4] = resultados.getString("Temperatura_Media");
            datosUrano[5] = resultados.getString("Tipo");
            datosUrano[6] = resultados.getString("Num_Satelites");
            datosUrano[7] = resultados.getString("Fecha_Creacion");
        }
        //5. Cerrar conexion
        resultados.close();
        statement.close();
        conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //6. return array
        return datosUrano;
    }
      /**
     * Conecta a la base de datos y consulta los datos del planeta Neptuno.
     *
     * @return Un array con los datos del planeta Neptuno.
     */
// Sentencias SQL    
    String sqlNeptuno = "SELECT * FROM Planetas WHERE nombre = 'Neptuno' ";
   
    //Métodos para conectar y consultar
    public String[] conectarConsultarNeptuno(){
        //1. Crear array
        String[] datosNeptuno = new String[7];
       
        try{
        //2. Conectarme
        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
        Statement statement = conexion.createStatement();
        //3. Lanzar query
        ResultSet resultados = statement.executeQuery(sqlNeptuno);
        //4. Recoger datos y guardar en array
        while (resultados.next()) {
            datosNeptuno[0] = resultados.getString("Radio");
            datosNeptuno[1] = resultados.getString("Nombre");
            datosNeptuno[2] = resultados.getString("Distancia_Media_Sol");
            datosNeptuno[3] = resultados.getString("Periodo_Orbital");
            datosNeptuno[4] = resultados.getString("Temperatura_Media");
            datosNeptuno[5] = resultados.getString("Tipo");
            datosNeptuno[6] = resultados.getString("Num_Satelites");
            datosNeptuno[7] = resultados.getString("Fecha_Creacion");
        }
        //5. Cerrar conexion
        resultados.close();
        statement.close();
        conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //6. return array
        return datosNeptuno;
    }
}
        