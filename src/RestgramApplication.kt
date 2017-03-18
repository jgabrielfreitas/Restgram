import com.jgabrielfreitas.HelloWithKotlin
import com.jgabrielfreitas.HelloWorld

import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application
import java.util.HashSet

/**
 * Created by JGabrielFreitas on 18/03/17.
 */

@ApplicationPath("/")
class RestgramApplication : Application() {

    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    override fun getClasses(): Set<Class<*>> {
        val h = HashSet<Class<*>>()
        h.add(HelloWorld::class.java)
        h.add(HelloWithKotlin::class.java)
        return h
    }
}
