package com.yingke.basic;

/**
 * 功能：
 * CSDN：
 * https://blog.csdn.net/tuke_tuke/article/details/50385376
 *
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-28
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 排序2_快速排序 {

    public class QuickSortClass {
        private int[] array;

        public int[] getArray() {
            return array;
        }

        public void setArray(int[] array) {
            this.array = array;
        }
        //快速排序
        public void quikSort(){
            QuikSort(0,array.length-1);
        }

        //递归的快速排序
        private void QuikSort(int low,int high){
            if(low>=high){
                return;
            }else{
                int pivot = array[low];  //以第一个元素为基准
                int partition =partition(low,high,pivot);  //对数组进行划分，比pivot小的元素在低位段，比pivot大的元素在高位段

                QuikSort(low,partition-1);   //对划分后的低位段进行快速排序
                QuikSort(partition+1,high);  //对划分后的高位段进行快速排序
            }
        }


        //以pivot为基准对下标low到high的数组进行划分 ,low 数组段的最小下标 ,high 数组段的最大下标 , pivot 划分的基准元素 , 划分完成后基准元素所在位置的下标
        private int partition(int low,int high,int pivot){

            while(low<high){
                while(low<high &&array[high]>=pivot){  //从右端开始扫描，定位到第一个比pivot小的元素
                    high--;  //如果array[high]比基准pivot大，就不管，继续向前移动
                }
                swap(low,high);  //如果array[high]比基准pivot小，就交换low和high

                while(low<high &&array[low]<=pivot){  //从左端开始扫描，定位到第一个比pivot大的元素
                    low++;    //如果array[low]比基准pivot小，就不管，继续向后移动
                }
                swap(low,high);  //如果array[low]比基准pivot大，就交换low和high

            }
            return low;

        }
        //交换数组中两个元素的数据
        private void swap(int low,int high){
            int temp = array[high];
            array[high] = array[low];
            array[low] = temp;
        }
    }
}
