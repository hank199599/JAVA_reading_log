# 類別 (class)
> 是把事物的資料與相關功能「封裝」(encapsulate)在一起所形成一種特殊的結構,  
> 用以表達真實事物的一種抽象概念。

![img8-1](../assets/8-1.png)

透過封裝,外界可以透過特定的方式取得類別裡不能直接被存取的資料,藉以維護物件的安全性

* 資料成員(field)：描述類別的各種屬性
* 函數成員(method)：描述類別可以執行的工作

## 類別的定義格式

* 類別名稱的命名與一般變數一樣，不能和關鍵字與保留字相同

```java
class 類別名稱
{
    資料型態 field名稱;    // 宣告
    ...                   // field

    傳回值的資料型態 函數名稱 (引數1, 引數2, ...)
    {
        程式敘述;       // 函數的本體
        return 運算式;  // (body)
    }
}
```

範例： 以**矩形**為例
* 資料成員： width 與 height
* 函數成員： area(), perimeter()

```java
class CRectangle
{
    int width;     // 宣告資料成員 width
    int height;    // 宣告資料成員 height

    int area ()    // 定義函數成員 area()，用來計算面積
    {
        return width*hwight;
    }

    int perimeter ()    // 定義函數成員 perimeter()，用來計算周長
    {
        return 2*(width+hwight);
    }
}
```

# 物件 (object)
> 由類別(class)所建立出的物件 -> instance (實例)  
> 新建立好的物件具有該類別的特徵

## 建立新的物件

1. 以類別名稱宣告變數
2. 利用 new 建立新的物件，並指派給先前所建立的變數

範例： 以**矩形**為例，建立矩形類別的物件
1. ```java
    CRectangle rect1;           // 以類別名稱 CRectangle宣告變數 rect1
    rect1 = new CRectangle();   //利用new建立新的物件，並讓變數rect1指向它
    ```
2.  ```java
    CRectangle rect1 = new CRectangle(); //利用new建立新的物件，並讓變數rect1指向它
    ```

※ 變數 rect1並不是基本型態的變數，可以視為CRectangle型態的變數 

### 存取物件的內容

```java
 物件名稱.資料成員名稱
```

※ 範例： 以**矩形**為例，存取rect1物件的寬跟高
```java
rect1.width;    // 矩形物件 rect1 的寬
rect1.height;   // 矩形物件 rect1 的高
```

e.g. 將物件 rect1 的寬設定為20，高設定為15
```java
public static void main(String args[])
{
    CRectangle rect1;
    rect1 = new CRectangle();

    rect1.width = 20;   // 設定矩形物件 rect1 的寬為20
    rect1.height = 15;  // 設定矩形物件 rect1 的高為15
}
```

### 定義和使用函數
> 透過OOP技術封裝在物件內

```java
傳回值的資料型態 函數名稱 (引數1, 引數2, ...)
{
    程式敘述;       // 函數的本體
    return 運算式;  // (body)
}
```
呼叫類別內的函數
```java
    物件名稱.函數名稱(引數1, 引數2, ...)
```

### 資料成員的存取方式

* 在main函數：需指定物件名稱
    ```java
        物件名稱.資料成員名稱
    ```
    e.g.
    ```java
    class app
    {
        public static void main(String args[])
        {
            ....
            cir1.radius = 2.0;
            cir1.pi = 3.0;
        }
    }
    ```
* 在類別宣告的內部使用這些資料成員，可以直接存取而不需呼叫它的物件名稱
    e.g.
    ```java
    class Ccircle
    {   
        double pi = 3.14;
        double radius;

        void show_area()
        {
            System.out.println("area="+pi*radius*radius);
        }
       
    }
    ```
* 「this」關鍵字：用以強調**物件本身的field**

### 引數的傳遞與回傳值
* 若函數本身沒有回傳值，則必須在前面加上 "void"
```java
void show_area()
{
    System.out.println("area="+pi*radius*radius);
}
```
* 若函數本身有回傳值，則必須在前面加上對應的資料型態
```java
    double getRadius()   // getRadius()函數：用來回傳物件的半徑
    {
        return radius; // 資料型態為double
    }

```

### 函數成員的多載

> 我們不能設計出引數個數和型態完全相同，而只有傳回值型態不同的多載  
> 城市會無法判斷是哪一個函數被呼叫

## 公有成員與私有成員

> 在類別外部存取資料成員時，如果沒有一個機制來限定存取的方式，很可能導致安全上的漏洞。  
> 進而發生錯誤

### 建立公有成員(public menber)
```java
public
```
* 沒有寫上"public"：該成員只能在同一個類別庫裡被存取
* 有寫上"public"：成員可以被其他類別庫的物件所存取
### 建立私有成員(private menber)
```java
private
```

## 封裝 (encapsulation)
把field和函數包裝在一個類別裡，用來限制成員的存取，以達到保護資料的一種技術。