package com.itheima.Works;

public class Test06 {
    public static void main(String[] args) {
        // 定义一个 int 类型的数组，用静态初始化完成数组元素的初始化

        // 调用方法，输出结果

    }

    /*定义一个方法，用于把 int 数组中的数据按照指定格式拼接成一个字符串返回
        返回值类型：String
        参数：int[] arr
     */
    public static String arrayToString(int[] arr) {
        // 健壮性判断

        //在方法中用 StringBuilder 按照要求进行拼接，并把结果转成 String 返回

            // 拼接元素

            // 如果不是最后一个元素，再拼接逗号和空格
            if (i != arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

