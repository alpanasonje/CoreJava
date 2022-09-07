package lesson5.string;

class StringBufferDemo {
   public static void main(String args[])  {

      // StringBuffer length vs. capacity.
      StringBuffer buffer = new StringBuffer("Java    Programming");
      System.out.println("buffer = " + buffer);
      System.out.println("length = " + buffer.length());
      System.out.println("capacity = " + buffer.capacity());

      // appending and inserting into StringBuffer.
      String s;
      int a = 42;
      buffer = new StringBuffer(40);
      System.out.println(buffer.length()+" : "+buffer.capacity());
      s = buffer.append("a = ").append(a).append("!").toString();
      System.out.println(s);
      System.out.println(buffer.length()+" : "+buffer.capacity());
      buffer = new StringBuffer("I Java!");
      buffer.insert(2, "like ");
      System.out.println(buffer);
   }
}
