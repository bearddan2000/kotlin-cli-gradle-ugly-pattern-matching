import kotlin.rem

/*This function divides a by greatest
	 divisible power of b*/
	 fun maxDivide(a:Int, b:Int): Int
	 {
         when {
             a.rem(b).toInt() != 0 -> return a
             else -> return maxDivide((a/b).toInt(), b)
         }
	 }

	 /* Function to check if a number
	 is ugly or not */
	 fun isUgly(no:Int, flag:Int): Boolean
	 {
         when (flag) {
             0 -> return isUgly(maxDivide(no, 2), 2)
             2 -> return isUgly(maxDivide(no, 3), 3)
             3 -> return isUgly(maxDivide(no, 5), 5)
             else -> return (no == 1)
         }
     }

	 /* Function to get the nth ugly
	 number*/
	 fun getNthUglyNo(n:Int, i:Int, count:Int)
	 {
         when {
            count > n -> println("[OUTPUT] " + (i-1))
             else ->
             {
                 when (isUgly(i, 0)) {
                 	true -> getNthUglyNo(n, i+1, count+1)
                 	else -> getNthUglyNo(n, i+1, count)
                 }
             }
         }
	 }


fun main() {
  val N: Int = 10
  println("[INPUT] " + N)
  getNthUglyNo(N, 1, 1)
}
