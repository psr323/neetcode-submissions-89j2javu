    class Node {
        int value;
        int key;
        Node prev;
        Node next;
        public Node(int key, int val){
            this.key = key;
            this.value = val;
            this.prev = null;
            this.next = null;
        }
    }
class LRUCache {

    Map<Integer, Node> cache;
    int capacity;
    Node left;
    Node right;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.left.next = right;
        this.right.prev = left;
        
    }
    
    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void add(Node node){
        node.next = this.right;
        node.prev = this.right.prev;
        this.right.prev.next = node;
        this.right.prev = node;
    }

    public int get(int key) {
        
        if(cache.containsKey(key)){
            remove(cache.get(key));
            add(cache.get(key));
            return cache.get(key).value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        
        Node node = new Node(key, value);
        if(cache.containsKey(key)){
            remove(cache.get(key));
        } 
        add(node);
        cache.put(key, node);

        if(cache.size() > this.capacity){
            Node lru = left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}
