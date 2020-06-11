using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Test0611
{
    class Program
    {

        private static void PrintDoubleArray(Array array)
        {
            for (int r = 0; r < array.GetLength(0); r++)
            {
                for (int c = 0; c < array.GetLength(1); c++)
                {
                    Console.Write(array.GetValue(r, c) + "\t");
                }
                Console.WriteLine();
            }
        }
        static void Main(string[] args)
        {
            int[,] map =  new int[4,4]
            {
                {2,2,4,8},
                {2,4,4,4},
                {0,8,4,0},
                {2,4,0,4}
            };
            PrintDoubleArray(map);
            Console.WriteLine("上移!!!");
            map = MoveUp(map);
            PrintDoubleArray(map);
            Console.ReadLine();
        }

        private static int[] RemoveZero(int[] array)
        {
            //0 0 0 0 
            int[] newArray = new int[array.Length];
            int index = 0;
            //将非零元素依次赋值给新数组
            for (int i = 0; i < array.Length; i++)
            {
                if (array[i] != 0)
                {
                    newArray[index++] = array[i];
                }
            }
            return newArray;
        }


        //2 2 0 2
        private static int[] Merge(int[] array)
        {
            array = RemoveZero(array);//2 2 2 0
            //合并数据
            for (int i = 0; i < array.Length - 1; i++ )
            {
                //相邻相同
                if (array[i] != 0 && array[i] == array[i + 1])
                {
                    array[i] += array[i + 1];
                    array[i + 1] = 0;
                }
            }
            array = RemoveZero(array);
            return array;
        }

        private static int[,] MoveUp(int[,] map)
        {
            //从上到下 获取每列数据，形成一维数组

            int[] mergeArray = new int[map.GetLength(0)];
            for (int c = 0; c < map.GetLength(1); c++)
            {
                for (int r = 0; r < map.GetLength(0); r++)
                {
                    mergeArray[r] = map[r, c];
                }
                mergeArray = Merge(mergeArray);
                for (int r = 0; r < map.GetLength(0); r++)
                {
                    map[r, c] = mergeArray[r];
                }
            }
            return map; 
        }

        private static int[,] MoveDowm(int[,] map)
        {
            for (int c = 0; c < map.GetLength(1); c++)
            {
                int[] mergeArray = new int[map.GetLength(0)];
                for (int r = map.GetLength(0) - 1; r >= 0; r--)
                {
                    mergeArray[3 - r] = map[r, c];

                }
                mergeArray = Merge(mergeArray);
                for (int r = map.GetLength(0) - 1; r >= 0; r--)
                {
                    map[r, c] = mergeArray[3 - r];
                }
            }
            return map;
            
        }
    }
}
