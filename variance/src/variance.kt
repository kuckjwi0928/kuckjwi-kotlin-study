interface Box<T>
open class Language
open class JVM : Language()
class Kotlin : JVM ()

fun main() {
    val languageBox = object : Box<Language> {}
    val jvmBox = object : Box<JVM> {}
    val kotlinBox = object : Box<Kotlin> {}

    // 무공변
    invariant(jvmBox)

    // 공변
    covariant(jvmBox)
    covariant(kotlinBox)

    // 반공변
    contravariant(jvmBox)
    contravariant(languageBox)
}

fun invariant(value: Box<JVM>) {}
fun covariant(value: Box<out JVM>) {}
fun contravariant(value: Box<in JVM>) {}
