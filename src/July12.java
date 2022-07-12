public class July12 {
    public static void main(String[] args) {

        System.out.println("for문 & for each문 연습하기");
        //for문 & for each문 연습하기
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println(" ");
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.print(i + "\t");

        }

        System.out.println("===================");


        System.out.println("for문 break 사용하기");
        int coffee = 5; //커피 양
        int money = 10; // 돈

        System.out.println("for문 실행");
        for(int i = 0; i< money ; i++){
            if (money == 110){
                System.out.println("장사 끝!!");
                break;
            }

            money += 20;
            coffee --;
            System.out.println("돈을 받았으니 커피를 판매합니다. 현재 자금: " + money);
            System.out.println("남은 커피의 양은 " + coffee + "잔 입니다.");
            System.out.println("끝까지 힘내자!!");

        }
        System.out.println("for문 끝!!!!");


        System.out.println("continue 사용하기");
        coffee = 5; //커피 양
        money = 10; // 돈

        System.out.println("for문 실행");
        for(int i = 0; i< money ; i++){
            if (money == 110){
                System.out.println("장사 끝!!");
                break;
            }

            money += 20;
            coffee --;
            System.out.println("돈을 받았으니 커피를 판매합니다. 현재 자금: " + money);
            System.out.println("남은 커피의 양은 " + coffee + "잔 입니다.");

            if (money == 110){
                System.out.println("돈을 다 모았습니다.");
                continue;
            }
            //money값이 100이면 밑에 코드(끝까지 힘내자!!)가 실행되지 않고 for문으로 간다.
            // 그리고 마지막으로 break 코드를 만나서 for 문 종료!


            System.out.println("끝까지 힘내자!!");

        }
        System.out.println("for문 끝!!!!");


    }
}
