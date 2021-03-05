public class testall {
    public static void main(String[] args) {

        // Account
        Account hihi = new Account("111", "hihi",50000);
        Account haha = new Account("222", "haha",40000);

        hihi.transferTo(haha,500);
        System.out.println(hihi.toString());
        System.out.println(haha.toString());

        // Date
        Date hehe = new Date(5,8,1995);
        System.out.println(hehe.toString());

        // Time
        Time hoho = new Time(23,59,58);
        System.out.println(hoho);
        Time hoho1 = hoho.nextSecond();
        System.out.println(hoho1);
        Time hoho2 = hoho.nextSecond();
        System.out.println(hoho2);
    }
}