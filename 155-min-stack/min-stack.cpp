class MinStack {
public:
    MinStack() {
        
    }
    stack<int> st;
    stack<int> minSt;
    
    void push(int val) {
        st.push(val);
        if(minSt.empty() || minSt.top() >= val)
        minSt.push(val);
    }
    
    void pop() {
        if(st.top() == minSt.top())
        minSt.pop();
        st.pop();
    }
    
    int top() {
        int ans = st.top();
        return ans;
    }
    
    int getMin() {
        int ans = minSt.top();
        // minSt.pop();
        return ans;
    }
};