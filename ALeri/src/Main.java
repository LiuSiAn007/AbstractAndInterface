public class Main {

    public static void main(String[] args) {
        int x = 0,y=0;
        for (int i=0 ; i< 20; i++){
            for(int j= 0; j < 34; j++){
                if (7 * i + 4 * j == 100){
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("公鸡有" + x +"只," + "母鸡有" + y +"只，" + "小鸡有" +(100-x-y) + "只");


        System.out.println("=================================================================");

        Main main = new Main();
        String ways = main.gotoBeijing(500);
        System.out.println(" 前往北京的方式有：" +ways);


    }

    public String gotoBeijing(int money){

        StringBuffer buffer = new StringBuffer();

        if (money >= 300) {
            buffer.append("公共汽车、");
        }

        if (money >= 400){
            buffer.append("火车、");
        }

        if (money >= 500){
            buffer.append("自驾、");
        }

        if (money >= 1000){
            buffer.append("飞机");
        }

        return buffer.toString();
    }
}
