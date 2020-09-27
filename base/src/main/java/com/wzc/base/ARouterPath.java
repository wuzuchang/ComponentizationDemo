package com.wzc.base;

public class ARouterPath {
    public interface ModuleA{
       String Test1= "/module_a/main";
       String Test2= "/module_a/second";
    }
    public interface ModuleB{
        String Test1= "/module_b/main";
        String Test2= "/module_b/second";
    }
    public interface ModuleC{
        String Test1= "/module_c/main";
        String Test2= "/module_c/second";
    }
}
