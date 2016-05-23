interface X {
    void f()
    void g(int n)
    void h(String s, int n)
}

x = {
    Object[] args -> println "method called with $args"
    } as X
    
x.f()
x.g(3)
x.h("hello", 5)