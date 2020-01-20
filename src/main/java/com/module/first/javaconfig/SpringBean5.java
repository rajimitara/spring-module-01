package com.module.first.javaconfig;

import com.module.first.common.service.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@Component
public class SpringBean5 {

    @Value("Raji")
    private String name;

    @Value("#{'Raji'.toUpperCase()}")
    private String nameInCaps;

    @Value("true")
    private boolean cool;

    @Value("7")
    private String empId;

    @Value("#{343*0.9}")
    private double salary;

    @Value("${spring.profiles.active}")
    private String profile;

    @Value("${spring.environment}:no_env")
    private String env;

    @Value("#{'${spring.value}'.toUpperCase()}")
    private String[] array;

    @Value("${spring.list.values}")
    private List<String> list;

    @Value("#{${spring.map.values}}")
    public Map<String,Integer> map;

    @Value("#{'${spring.value}'.toUpperCase()}")
    private String stringValue;

    @Value("#{@playlistService2.activeProfiles}")
    public String activeEnv;

    public Set<Integer> ids;


    @Autowired
    public SpringBean5(@Value("${spring.list.values}") List<String> list, SpringBean1 springBean1,SpringBean2 springBean2 , Optional<Player> player) {

    }

    @Autowired
    public void setId(@Value("${spring.set.values}") Set<Integer> set){
        this.ids = set;
    }

    public String getName() {
        return name;
    }

    public String getNameInCaps() {
        return nameInCaps;
    }

    public boolean isCool() {
        return cool;
    }

    public String getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }

    public String getProfile() {
        return profile;
    }

    public String getEnv() {
        return env;
    }

    public String[] getArray() {
        return array;
    }

    public List<String> getList() {
        return list;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public String getStringValue() {
        return stringValue;
    }

    public String getActiveEnv() {
        return activeEnv;
    }

    public Set<Integer> getIds() {
        return ids;
    }
}
