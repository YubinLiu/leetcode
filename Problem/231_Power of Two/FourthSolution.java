public class FourthSolution {
  public boolean isPowerOfTwo(int n) {
      if(n > 0) return ((n & (n-1)) == 0) ;
      else return false;
  }
}
