package class11HW;

public class DogTester {
    public static void main(String[] args) {


        dog dog1 = new dog();
        dog1.name="husky";
        dog1.color="black";
        dog1.wight="149_lb";

        dog1.safeQuard();
        dog1.food();
        dog1.behavior();

        dog dog2=new dog();
        dog2.name="Bulldog";
        dog2.color="gray";
        dog2.wight="100lb";

        dog2.safeQuard();
        dog2.food();
        dog2.behavior();



    }
}