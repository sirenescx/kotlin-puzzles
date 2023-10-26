package sonar_sweep

fun sonarSweep1() {
    var numberOfMeasurementsLargerThanPrevious = 0
    var depth = readln().toIntOrNull()

    while (depth != null) {
        val nextDepth = readln().toIntOrNull() ?: break
        if (nextDepth > depth) {
            numberOfMeasurementsLargerThanPrevious++
        }
        depth = nextDepth
    }

    println(numberOfMeasurementsLargerThanPrevious)
}

fun sonarSweep2() {
    var numberOfMeasurementsLargerThanPrevious = 0
    var depth1 = readln().toIntOrNull()
    var depth2 = readln().toIntOrNull()
    var depth3 = readln().toIntOrNull()

    while (depth1 != null && depth2 != null && depth3 != null) {
        val nextDepth = readln().toIntOrNull() ?: break
        if (depth1 < nextDepth) {
            numberOfMeasurementsLargerThanPrevious++
        }
        depth1 = depth2
        depth2 = depth3
        depth3 = nextDepth
    }

    println(numberOfMeasurementsLargerThanPrevious)
}

fun main() {
    val part = readln().toIntOrNull()
    when (part) {
        1 -> sonarSweep1()
        2 -> sonarSweep2()
        3 -> return
    }
}
