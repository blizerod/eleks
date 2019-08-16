public class Program {

    public static void main(String[] args) {
        Account<String> acc1 = new Account<>("2345", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Account<Integer> acc2 = new Account<Integer>(2345, 5000);
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);
    }

    static class Account<Integer> {
        private Integer id;
        private int sum;

        Account(Integer id, int sum) {
            this.id = id;
            this.sum = sum;
        }

        public Integer getId() {
            return id;
        }

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }
    }
}
