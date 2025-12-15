/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.db4o;
import Business.SystemConfiguration;
import Business.Ecosystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;
/**
 *
 * @author talha
 */
public class db4o {
    private static final String FILENAME = Paths.get("Database.db4o").toAbsolutePath().toString();// path to the data store
    private static db4o dB4OUtil;
    
    public synchronized static db4o getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new db4o();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer buildConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(Ecosystem.class).cascadeOnUpdate(true); // Change to the object you want to save

           
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(Ecosystem ecosystem) {
        ObjectContainer conn = buildConnection();
        conn.store(ecosystem);
        conn.commit();
        conn.close();
    }
    
    public Ecosystem retrieveSystem(){
        ObjectContainer conn = buildConnection();
        ObjectSet<Ecosystem> ecosystems = conn.query(Ecosystem.class); // Change to the object you want to save
        Ecosystem ecosystem;
        if (ecosystems.isEmpty()){
            ecosystem = SystemConfiguration.configure();  // If there's no System in the record, create a new one
        }
        else{
            ecosystem = ecosystems.get(ecosystems.size() - 1);
        }
        conn.close();
        return ecosystem;
    }
}
