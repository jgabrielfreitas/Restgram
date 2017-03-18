import com.jgabrielfreitas.HelloWithKotlin;
import com.jgabrielfreitas.HelloWorld;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by JGabrielFreitas on 18/03/17.
 */

@ApplicationPath("/")
public class RestgramApplication extends Application {

    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(HelloWorld.class);
        h.add(HelloWithKotlin.class);
        return h;
    }
}
