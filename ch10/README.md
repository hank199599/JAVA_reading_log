# 類別的繼承
> JAVA可根據既有類別為基礎，進而衍伸出另一類別。

## 繼承 (inheritance)

|既有的類別|衍伸出的類別|
|---------|-----------|
|父類別(super class)|子類別(sub class)|
|基底類別(basis class)|衍出類別(derived class)|

### 分類：

* 單一繼承 (single inheritance): JAVA  
  每一個類別只能有一個父類別
* 多重繼承 (multiple inheritance): C++
  一個父類別可以擁有一個以上的子類別

### 繼承內容

* 可直接繼承
  * 沒有宣告成public或private的成員
  * public成員
  * protected成員
* 不能直接在子類別存取，只能透過父類別的函數做存取
  * private成員
* 不能繼承
  * 建構元
  * 設定終止繼承的成員

### 關鍵字
> 透過繼承的方式，使得某個物件的資源得以重複使用。
```java
extends
```

```java
class 父類別名稱
{
    //父類別裡的成員
}

class 子類別名稱 extends 父類別名稱
{
    //子類別裡的成員
}
```

1. 透過 extends 關鍵字,可將父類別的成員(包含資料成員與函數成員)繼承給子類別。。

2. Java 在執行子類別的建構元之前,會先呼叫父類別的建構元,其目的是為了要幫助繼承自父類別的成員做初始化的動作。

### 建構元的呼叫
> 在子類別的建構元中，透過該關鍵字呼叫父類別的建構元
> 必須要在有繼承關係的狀況下方可使用
```java
super()
```
Java 在執行子類別的建構元之前,如果沒有用 super()來呼叫特定父類別的建構元,  
則會先呼叫父類別中"沒有引數的建構元"。因此,如果父類別中只定義有引數的建構元
(此時Java不再提供父類別預設的建構元),而在子類別的建構元裡又沒有用 super() 来呼叫父類別中特定的建構元的話,則編譯時將發生錯誤,因為Java 在父類別中找不到"沒有引數的建構元"可供執行。

## ```this()``` v.s. ```super()```
|     this()     |     super()     |
|------|-------|
|在同一類別內呼叫其他建構元|從子類別內呼叫父類別的建構元|
|能支援建構元多載|能支援建構元多載|
|須寫在建構元的第一行|須寫在建構元的第一行|

※ this() 與 super() 無法共存在同一個建構元內

## 存取父類別的資料成員與函數成員

```java
super.資料成員名稱
```
```java
super.函數名稱
```

# 保護成員 (protected members)

若子類別欲存取位於父類別，會出現無法存取之錯誤訊息。  
因為原先的資料成員被宣告為```private```  
e.g. app10_2_1.java
```
app10_2_1.java:34: error: radius has private access in CCircle
        radius = r;
        ^
1 error
```
## 使子類別能存取被保護的資料成員
```java
protected
```
把成員宣告成 protected 最大的好處是可同時兼顧到成員的安全性與便利性,  
因為它只能供父類別與子類別的內部來存取,外界無法更改或讀取。  
附帶一提,父類別裡的 protected 成員,繼承到子類別之後,其存取的屬性還是 protected。

# 改寫 (overriding)
> 與「多載」相似，均是JAVA「多型(polymorphism)」的技術之一

利用「改寫」的技術,於子類別中可定義和父類別裡之名稱、引數個數與資料型態均完全相同的函數,  
用以取代父類別 中原有的函數。

## 多載 v.s. 改寫

||多載|改寫|
|-|---------|-----------|
|英文名|overloading|overriding|
|關係|相同類別內|子類別中|
|功能|根據引數的葛數或形態，呼叫相對應的函數|改寫父類別裡的函數|

## 以父類別的變數存取子類別的成員
1. 透過父類別的變數仍然可以存取到子類別物件的成員
2. 透過父類別的變數存取子類別物件的成員，僅限於「**改寫**」的情況發生時。  
   (父類別與子類別的函數名稱、引數個數與型態必須完全相同)


# 物件導向名詞解釋

```java
class CCircle // 父類別
{
  String name;
}

class CCoin extends CCircle // 子類別
{

}
```

* "has-a" : 類別與內部成員的關係
* "is-a" : 有繼承關係的類別

# 設定終止繼承
```java
final
```
1. 加在資料成員前面，使該成員成為一個**常數(constant)**
    ```java
      protected static final double PI = 3.14;
    ```
2. 使某類別無法被其他類別繼承，於宣告時加入
   * 變數或是類別裡的資料成員經過 final 宣告之後,就像常數般無法再被更改其值,  
      它的值只能在 final 宣告時設定一次。

   * 函數經過 final 宣告之後,不能被改寫。

   * 類別經過 final 宣告後,不能被繼承。

    ```
    app10_10.java:11: error: show() in Cbbb cannot override show() in Caaa
    public void show()
                ^
      overridden method is final
    1 error
    ```

# Object 類別：所有類別之父類別
> 事實上於Java裡,如果某一類別沒有指定其父類別的話,  
> 則Java會**自動設定該類別繼承自 Object 這個類別**,  
> 而成為它的子類別 (Object是置於java.lang 類別庫裡的一個類別)

```java
// 未指定父類別時，會以java.lang.Object類別作為他的父類別，而自身成為它的子類別
class CCircle 
{
  ... 
}
```

* Object類別是類別之源，所有類別都直接或間接繼承它。

## Object類別裡常用的函數

|函數名稱|功能說明|
|---------|-----------|
|```Class getClass()```|取得呼叫 getClass() 的物件所屬的類別|
|```Boolean equals(Object obj)```|兩個類別變數所指向是否為同一個變數|
|```String toString()```|將呼叫toString()的物件轉成字串|

###  getClass()
```java
obj.getClass() // 取得變數obj所指向之物件所屬的類別
```
> getClass()函數的回傳值是Class型態，必須先宣告一個Class變數來接收它。

### equals()
> 用來比較兩個類別函數是否指向同一個物件