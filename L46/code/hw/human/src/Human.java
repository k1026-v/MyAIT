public class Human implements Comparable {
      String name;
      int height;
       int weight;
       int age;

        // конструктор
        public Human(String name, int height, int weight, int age) {
            this.name = name;
            this.height = height;
            this.weight = weight;
            this.age = age;
        }



        @Override
        public String toString() {
            return "\n Human{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", weight=" + weight +
                    ", age=" + age +
                    '}';
        }


    @Override
    public int compareTo(Object o) {
        return this.name;
    }
}
