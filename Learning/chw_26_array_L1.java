package Learning;

    public class chw_26_array_L1  {
        public static void main(String[] args) {
        /* Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
        */
            // There are three main ways to create an array in Java
            // 1. Declaration and memory allocation
            // int [] marks = new int[5];

            // 2. Declaration and then memory allocation
            // int [] marks;
            // marks = new int[5];
            // Initialization
            // marks[0] = 100;
            // marks[1] = 60;
            // marks[2] = 70;
            // marks[3] = 90;
            // marks[4] = 86;
            // marks[5] = 96; - throws an error because we define 5 numbers

            // 3. Declaration, memory allocation and initialization together
            int [] marks = {98, 45, 79, 99, 80};


            System.out.println(marks[1]);

        }
    }


