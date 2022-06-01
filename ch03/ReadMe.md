
# JAVA基本資料型態與初始值
> 無論在哪一個作業系統，JAVA裡相同的資料型態均具有相同的位元組

- 原始資料型態 (primitive type)
- 非原始資料型態 (non-primitive type)

|資料型態|意義|位元組|表示範圍|初始值|
|---|---|---|---|---|
|long|長整數|8|-9223372036854775808~9223372036854775807|0L|
|int|整數|4|-2147483648~2147483647|0|
|short|短整數|2|-32768~32767|0|
|byte|位元|1|-128~127|0|
|char|字元|2|0~65535('\u0000'~'\uFFFF')|'\u0000'|
|boolean|布林|1|true 或 false|false|
|float|浮點數|4|-3.4*10³⁸~3.4*10³⁸|0.0F|
|double|倍精度|8|-1.7*10³⁰⁸~1.7*10³⁰⁸|0.0D|

# 整數型態
> 依據預期的資料範圍，宣告不同類型的整數來節省記憶體空間

1. long
2. int
3. short
4. byte

```java
    short sum; // 宣告sum為短整數
```

```java
    long num = 3296739818L; // 宣告num為長整數
```
## 整數型態最大值與最小值的代碼
> JAVA 提供的四種整數型態最大值與最小值的代碼

```
    java.lang . Long . MAX_VALUE
    [ 類別庫 ] . [整數類別] . [最大值的代碼]
```

```
    java.lang . Long . MIN_VALUE
    [ 類別庫 ] . [整數類別] . [最小值的代碼]
```

|資料型態|所屬類別|最小值|最大值|
|---|---|---|---|
|long|java.lang.Long|8|-9223372036854775808|9223372036854775807|
|int|java.lang.Integer|4|-2147483648|2147483647|
|short|java.lang.Short|2|-32768|32767|
|byte|java.lang.Byte|1|-128|127|

## 溢位的發生
> 整數的大小超過可以表示的範圍，而程式中又未對數值範圍做檢查時。

### 解法一：加入關鍵字強制進行型態轉換
- 在該運算式中整數數值之後加上L
```java
    int i = java.lang.Integer.MAX_VALUE;
    i+2L // 使其轉換為長整數
```
- 在該運算式中整數數值之前加上long
```java
    int i = java.lang.Integer.MAX_VALUE;
    (long)i+2 // 使其轉換為長整數
```
※缺點：long長整數型態的溢位無法以上述方法處理

### 解法二：自動型態轉換 (automatic type conversion)
short 與 byte 型態會被JAVA自動轉換為int型態

# 字元型態：Unicode (標準萬國碼)

## 跳脫序列清單
|跳脫序列|意義|
|---|---|
|\f|換頁|
|\b|倒退一格|
|\n|換行|
|\r|歸位|
|\t|跳格|
|\\\\ |反斜線|
|\\\'|單引號|
|\\\"|雙引號|
|\uxxxx|十六進位的unicode字元|
|\ddd|八進位的unicode字元|

# 浮點數型態
- float
- double

## 浮點數型態最大值與最小值的代碼
```
    java.lang . Float . MAX_VALUE
    [ 類別庫 ] . [浮點數類別] . [最大值的代碼]
```

```
    java.lang . Float . MIN_VALUE
    [ 類別庫 ] . [浮點數類別] . [最小值的代碼]
```

|資料型態|所屬類別|最小值|最大值|
|---|---|---|---|
|float|java.lang.Float|-3.4*10³⁸|3.4*10³⁸|
|double|java.lang.Double|-1.7*10³⁰⁸|1.7*10³⁰⁸|

# 布林型態
> 只有 ture(真) 和 false(假) 兩種，不能用 0 和 1 表示
```java
    boolean ststus = true;
```

# 資料型態的轉換

## 自動型態轉換

需符合以下條件：
- 轉換前的資料型態與轉換後的型態相容
- 轉換後的資料型態之表示範圍比轉換前的型態大：**擴大轉換 (augmented conversion)**

1. 佔用位元組較少的型態轉換成位元組較多的型態。
2. 字元型態會轉換成short 型態(字元會取其 unicode碼)
3. short 型態(2 bytes)遇上 int 型態(4 bytes) 會轉換成 int 型態。
4. int 型態會轉換成 float 型態。
5. 運算式中若某個運算元的型態為 double,則另一個運算元也會轉換成 double 型態。
6. 布林型態不能轉換成其它的型態。


## 強制型態轉換
```
 (欲轉換的資料型態)變數名稱;
```
範例：當兩個整數相除時，小數點後的數字會被截斷，使運算結果保持為整數。  
若欲輸出結果為浮點數，則需要進行強制轉換型態為浮點數

1. (float)a/b
2. a/(float)b
3. (float)a/(float)b
   

# 由鍵盤輸入資料：Scanner

```java
import java.util.Scanner;
public class class_name
{
    public static void main(String args[])
    {
        Scanner 物件名稱 = new Scanner(System.in)   //宣告Scanner類別的變數
        資料型態 變數名稱 a;                         //宣告變數
        ...
        變數名稱=物件名稱.相對應型態的Scanner類別函數  //毒入資料至變數
    }
}
```
> 輸入字串時，可以使用next()或nextLine()函數  
> 若字串中確定帶有空白字元，就必須使用nextLine()

|跳脫序列|意義|
|---|---|
|byte|nextByte()|
|short|nextShort()|
|int|nextInt()|
|long|nextLong()|
|float|nextFloat()|
|double|nextDouble()|
|String|next()|
|String|nextLine()|

