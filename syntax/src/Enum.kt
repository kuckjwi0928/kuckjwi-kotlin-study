enum class Error(val num: Int) {
    WARN(2) {
        override fun getErrorName(): String {
            return "WARN"
        }
    },
    ERROR(3) {
        override fun getErrorName(): String {
            return "ERROR"
        }
    },
    FAULT(1) {
        override fun getErrorName(): String {
            return "FAULT"
        }
    };

    abstract fun getErrorName(): String
}

fun main() {
    println(Error.WARN.getErrorName())
    println(Error.ERROR.getErrorName())
    println(Error.FAULT.getErrorName())
}