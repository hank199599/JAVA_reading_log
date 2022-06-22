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
