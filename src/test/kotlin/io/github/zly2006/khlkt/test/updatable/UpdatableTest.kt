package io.github.zly2006.khlkt.test.updatable

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import io.github.zly2006.khlkt.utils.DontUpdate
import io.github.zly2006.khlkt.utils.Updatable
import kotlin.test.junit5.JUnit5Asserter

class UpdatableTest(
    var ccc: Int = 0,
    val ddd: Int = 0
): Updatable {
    var aaa: Int = 0
    val bbb: Int = 0
    var eee = false
    var fff = 1.0
    @field:SerializedName("s")
    var ggg = ""
    var sss = listOf("")
    @field:DontUpdate
    var no = "no"
    override fun update() {
        TODO("Not yet implemented")
    }
}
fun main() {
    val t = Gson().fromJson("{\"s\":\"abc\"}", UpdatableTest::class.java);
    println(t.ggg)
    println()
    t.updateByJson(
        Gson().toJsonTree(mapOf(
            "aaa" to 1,
            "bbb" to 2,
            "ccc" to 3,
            "ddd" to 4,
            "eee" to true,
            "fff" to -1,
            "s" to "test success",
            "sss" to "",
            "no" to "yes"
        ))
    )
    JUnit5Asserter.assertEquals("", t.aaa, 1)
    JUnit5Asserter.assertEquals("", t.bbb, 0)
    JUnit5Asserter.assertEquals("", t.ccc, 3)
    JUnit5Asserter.assertEquals("", t.ddd, 0)
    JUnit5Asserter.assertEquals("", t.eee, true)
    JUnit5Asserter.assertEquals("", t.fff, -1.0)
    JUnit5Asserter.assertEquals("", t.ggg, "test success")
    JUnit5Asserter.assertEquals("", t.sss.size, 1)
    JUnit5Asserter.assertEquals("", t.sss.size, 1)
    println(t.aaa)
    println(t.bbb)
    println(t.ccc)
    println(t.ddd)
    println(t.eee)
    println(t.fff)
    println(t.ggg)
    println(t.sss.size)
    println(t.no)
}