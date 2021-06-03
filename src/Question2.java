public class Question2 {
    /**   N∗(N−1)/2
     *  n-1 + n -2 + n-3
     *  ......n-(n-1)
     *  base case  is 1 (n-(n-1) =1)
     * impossible get negative value and 0
     */
        /*
          n=2 1

          n=3 3 = a+n

          n=4 6

          n=5 10

          n=6 15

            7 21

          n=N T(N)=(N-1)+(N-2)+(N-3)+N-4 + ..(N-(N-1))==1
                     6     5     4    3     2
         */
        public static void main(String[] args) {
            System.out.println("Mesh Topology");
            System.out.println("There are 4 switches in the campus");
            System.out.println("The total number of connections required is: "+getTotal(4));
            System.out.println("There are 7 switches in the campus");
            System.out.println("The total number of connections required is: "+getTotal(7));
        }

        public static int getTotal(int nodes){
            if(nodes>0)
                return (nodes-1)+getTotal(nodes-1);
            else
                return 0;
        }
}
