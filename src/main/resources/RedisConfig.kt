import org.springframework.beans.factory.annotation.Value
import org.springframework.cache.annotation.CachingConfigurerSupport
import org.springframework.context.annotation.Configuration

@Configuration
class RedisConfig {

    @Value("\${spring.redis.host}")
    private lateinit var host: String
    @Value("\${spring.redis.port}")
    private var port: Int = 0
    @Value("\${spring.redis.timeout}")
    private var timeout: Int = 0
}