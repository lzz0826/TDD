# TDD（Test-Driven Development）  測試驅動編成(編成方法學,編成思想) 

先寫測試 在編成   

## 優點 :   

###  促使開發者思考結構  
為了先寫出測試，開發者必須先去思考如何進行測試。   
同時若嚴格實行 TDD，每個循環的步驟1~2都只編寫最少量的程式碼，程式們會趨向被編寫成小而獨立的區塊，而增加了維護性與再利用性。   
因此會帶來幾個特點：   
*寫出可重複測試的程式  
*減少程式之間的耦合   
*函式小而簡潔   
而如果開發的最後才寫測試，則容易發現函式之間互相依賴，導致難以編寫個別函式的單元測試。   

###  易於重構 (Refactor 及早發現，及早治療)   
所謂重構，指的是維持程式已完成的功能，但是整理程式碼以增加可維護性，像是把修改成更有意義的變數名稱、將過大的函式拆開等等。  
利用 TDD 開發的過程中，幾乎所有的程式都維持在已編寫了單元測試的狀態，也許只要幾秒就能運行完一次所有的測試，不怕把程式改到爆掉。   


當我們面對複雜又大量的程式碼時，會害怕我們一但修改了其中一行，導致整個程式崩潰，這時我們也跟著程式崩潰了，因為 Debug 地獄既煩人又耗時。於是開發者會傾向不去觸碰以前寫好、目前運作上正常的程式碼，日積月累，最終演變成幾乎沒有可讀性。  
但擁有測試就能夠一定程度確保，沒有把原本寫好的程式破壞掉，若有，測試通常會第一時間印出哪一行的單元測試有錯誤，這也是說 TDD 的每個循環都做了一次 regression test (回歸測試)。讓開發者更勇於對程式碼進行重構，因此也容易保持簡潔。

###  減少 Debug 的時間   
相當多 Bug 會在執行測試時被檢測出來，Debug 的時間當然也減少了。    
同時每一個函式小而獨立，要檢測出 Bug 出在哪一個函式也就相對容易。   


###  高測試覆蓋率   
覆蓋率是指，程式碼有被測試執行過的比例，測試的工具套件能夠提供。    
這一點算是使用 TDD 開發附帶的好處，因為我們在開發的同時，一邊也在寫著測試，程式的測試覆蓋率會非常高。   
開發後一次編寫所有測試，較容易忽略一些可能發生的正常執行情況，另一方面一次花費大量的編寫時間。   




## TDD 流程可以分成五個步驟：  

![image](https://github.com/lzz0826/TDD/blob/main/src/main/resources/static.images/%202022-12-1510.00.12.png)

### 步驟一：選定一個功能，新增測試案例  
重點在於思考希望怎麼去使用目標程式，定義出更容易呼叫的 API 介面。   
這個步驟會寫好測試案例的程式，同時決定產品程式的 API 介面。   
但尚未實作 API 實際內容。   


### 步驟二：執行測試，得到 Failed（紅燈）  
由於還沒撰寫 API 實際內容，執行測試的結果自然是 failed。   
確保測試程式可執行，沒有語法錯誤等等。   

### 步驟三：實作「夠用」的產品程式   
這個階段力求快速實作出功能邏輯，用「最低限度」通過測試案例即可。   
不求將程式碼優化一步到位。   


### 步驟四：再次執行測試，得到 Passed（綠燈）  
確保產品程式的功能邏輯已經正確地得到實作。   
到此步驟，將完成一個可運作且正確的程式版本，包含產品程式和測試程式。   

### 步驟五：重構程式   
優化程式碼，包含產品程式和測試程式（測試程式也是專案需維護的一部份）。   
提升程式的可讀性、可維護性、擴充性。   
同時確保每次修改後，執行測試皆能通過。   

## 實際案例 DEMO : TDD/src/test/java/com/tony/tdd/tdddemo/TddDemoApplicationTests.java    

預計情況 1. 假設有個空的購物籃 取得全部 預設是空的0.0   

預計情況 2. 假設購物欄里有一個商品 商品100元*1    

預計情況 3. 假設購物欄里有兩個商品 商品100元*1  商品200元*1   

預計情況 4. 假設購物欄里有兩個商品 商品100元*2    



## 缺點 :   

### 修改要能夠馬上執行   
這樣才能讓每個 TDD 的循環很快地進行，這表示不少跟硬體相關的開發無法使用 TDD (像是嵌入式需要把程式燒錄到開發板上)。   

### 開發時需要連同測試一起寫
需要把寫測試的時間也加進開發中,如需要快速開發出樣本會拖慢整體速度。    


### 測試們同樣需要被維護   
並不是寫了測試，程式就一定會保持整潔，有可能開發者怕測試壞掉，反而又避免去修改測試程式，那還是會造成沒有可讀性。   

###  並不是所有測試都通過了，就表示沒有 bug   
寫過程式大概都知道，邏輯的錯誤不容易查，同時自動化測試也可能寫錯，甚至是原本就並未包含在需求內的，但在系統上線時卻發生。   

## 個人總結:  

### 要導入TDD，需要對產品的呈現了解,軟體的需求必須明確，才能讓測試程式碼開發先行   

### 在迫切需要上線優先的求情況下,基於時間壓力並不適合.例: 
*1. 客戶發需求    
*2. N個團隊同時開發   
*3. 優先上線給Demo的團隊比較有機會拿到該專案(大多客戶不懂代碼,只會看運行結果)

這時候快速開發,只在必要得地方做測試,後續在修正細節,優先取得專案所有權較有優勢 *  

### 需要整體團隊一同使用TDD開發,且需要持續使用   

### 專案中途加入效果不大

