package Learning;

public class cwh_12_ps_ch2_pro2 {
    public static void main(String[] args) {
        char grade =  'B';
        //encrypting the grade
        grade = (char)(grade + 8);
        System.out.println(grade);

        //decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

    }

}
