package com.itheima.inspur;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {
        private int id;
        private String name;
        private int age;
        private double sal;
        private String stunoArray[];
        private List lists;
        private Set sets;
        private Map scoreMap;
        private Properties props;
        private Address address;

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setSal(double sal) {
            this.sal = sal;
        }

        public void setStunoArray(String[] stunoArray) {
            this.stunoArray = stunoArray;
        }

        public void setLists(List lists) {
            this.lists = lists;
        }

        public void setSets(Set sets) {
            this.sets = sets;
        }

        public void setScoreMap(Map scoreMap) {
            this.scoreMap = scoreMap;
        }

        public void setProps(Properties props) {
            this.props = props;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", sal=" + sal +
                    ", stunoArray=" + Arrays.toString(stunoArray) +
                    ", lists=" + lists +
                    ", sets=" + sets +
                    ", scoreMap=" + scoreMap +
                    ", props=" + props +
                    ", address=" + address +
                    '}';
        }

}
