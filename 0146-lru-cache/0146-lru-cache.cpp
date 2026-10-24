class LRUCache {
public:
    int capacity;
    list<pair<int, int>> lru;

    unordered_map<int, list<pair<int, int>>::iterator> map;

    LRUCache(int capacity) { this->capacity = capacity; }

    int get(int key) {
        if (map.find(key) == map.end())
            return -1;
        auto it=map[key];
        int value=it->second;
        lru.erase(it);
        lru.push_back({key,value});

        map[key] = prev(lru.end());
        return value;
    }

    void put(int key, int value) {
        if (map.find(key) != map.end()) {
            lru.erase(map[key]);
        }else if(lru.size()==capacity){
            int old=lru.front().first;
            map.erase(old);
            lru.pop_front();
        }
            lru.push_back({key, value});
            map[key] = prev(lru.end());
    }
};

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache* obj = new LRUCache(capacity);
 * int param_1 = obj->get(key);
 * obj->put(key,value);
 */