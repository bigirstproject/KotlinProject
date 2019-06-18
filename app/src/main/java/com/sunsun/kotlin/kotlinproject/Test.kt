package com.sunsun.kotlin.kotlinproject

object Test{

    var x  = 10;


    fun sum1(a: Int,b: Int): Int{
        x =10;
        return a + b;
    }

    fun sum2(a: Int,b: Int) = a + b;

    public fun sum3(a: Int,b: Int):Int = a + b;

    fun printSum(a: Int,b: Int):Unit{
      print(a +b);
    }

    fun vars(vararg v:Int):Int{
        var sum =0;
        for(vt in v) {
            sum += vt;
        }
        var sum1  =sumLambda(12,12);
        return sum+sum1;
    }

    val sumLambda:(Int,Int) -> Int = {x,y -> x+y}




    fun str():String{
        var a= 1;
        val s1:String  ="a is $a"
        a = 2;
        val s2  = "${s1.replace("is","was")}, but now is $a"
        return s2;
    }

    fun str1(){
        //类型后面加?表示可为空
        var age: String? = null;
        //抛出空指针异常
       // val ages = age!!.toInt()
        //不做处理返回 null
        val ages1 = age?.toInt()
        //age为空返回-1
        val ages2 = age?.toInt() ?: -1
    }

}

