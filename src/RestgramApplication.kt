import com.jgabrielfreitas.HelloWithKotlin
import com.jgabrielfreitas.resources.Instagram
import com.jgabrielfreitas.resources.Users
import java.util.*
import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application

/**
 * Created by JGabrielFreitas on 18/03/17.
 */

@ApplicationPath("/")
class RestgramApplication : Application() {

    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    override fun getClasses(): Set<Class<*>> {
        val h = HashSet<Class<*>>()
        h.add(HelloWithKotlin::class.java)
        h.add(Instagram::class.java)
        h.add(Users::class.java)
        return h
    }
}
