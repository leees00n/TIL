public class p1ch1_01 {
    public static void main(String[] args){


//        1.변수 사용하기
        System.out.println("==변수 사용하기==");
        int age = 10;
        System.out.println(age);
        String country = "korea";
        System.out.println(country);



//        2. 변수 이름 규칙

//      2-1 문자, 숫자, _underbar, $ 사용할 수 있다.
        int apple = 2000;
        int apple3 = 2000;
        int _apple = 2000;
        int $apple = 2000;

        System.out.println("$apple = " + $apple);
        System.out.println(apple3);

//      2-2 숫자로는 시작할 수 없다.
//
//      int 3apple = 2000;
       // System.out.println(3apple);

        
//      2-3 대소문자 구분

        int Apple5 = 2000;
        System.out.println("Apple5 = " + Apple5);

        int apple5 = 1000;
        System.out.println("apple5 = " + apple5);


//      2-4 공백 사용은 불가능
        int one_apple = 1000;
        int oneApple = 1000;

        //그래서 언더바를 사용하거나, 파스칼 표기법으로 사용해야 함.


    }
}
