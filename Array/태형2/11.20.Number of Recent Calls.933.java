

  class RecentCounter {
    private Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }

    public int ping(int t) {
        requests.add(t);

        while (requests.peek() < t - 3000) {
            requests.poll();
        }

        return requests.size();
    }

    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();
        System.out.println(counter.ping(1)); // Output: 1
        System.out.println(counter.ping(100)); // Output: 2
        System.out.println(counter.ping(3001)); // Output: 3
        System.out.println(counter.ping(3002)); // Output: 3
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
