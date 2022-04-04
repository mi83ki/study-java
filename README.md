# study-java
Javaの勉強をします。

# 参考にした本
すっきりわかるJava 入門
https://www.amazon.co.jp/%E3%82%B9%E3%83%83%E3%82%AD%E3%83%AA%E3%82%8F%E3%81%8B%E3%82%8BJava%E5%85%A5%E9%96%80-%E7%AC%AC3%E7%89%88-%E3%82%B9%E3%83%83%E3%82%AD%E3%83%AA%E3%82%B7%E3%83%AA%E3%83%BC%E3%82%BA-%E4%B8%AD%E5%B1%B1%E6%B8%85%E5%96%AC/dp/4295007803/ref=sr_1_1?adgrpid=102227084297&gclid=CjwKCAjwiuuRBhBvEiwAFXKaNNVXhyxWTlj27vF9ZBpq2RebSzNScJp6tw0uP-7eMkN31RArdr2X2hoCf_MQAvD_BwE&hvadid=448230885061&hvdev=c&hvlocphy=1009536&hvnetw=g&hvqmt=e&hvrand=2886078180778783188&hvtargid=kwd-334256431401&hydadcr=27266_11561146&jp-ad-ap=0&keywords=%E3%82%B9%E3%83%83%E3%82%AD%E3%83%AA%E3%82%8F%E3%81%8B%E3%82%8Bjava%E5%85%A5%E9%96%80&qid=1648042346&sr=8-1

# 開発環境の構築
## JDKのインストール
JDKとはJava SE Development Kitのことで、Javaのインタプリタやコンンパイラ、その他関連の開発ツール一式を詰め合わせたものである。
オラクル社のホームページから無料でダウンロードできる。
1. コマンドプロンプトを起動する
1. 以下のコマンドを実行
    ```bash
    javac -version
    ```
    JDKがインストールされていなければ、以下のメッセージがでるので、インストール作業を進める
    ```bash
    'javac' は、内部コマンドまたは外部コマンド、
    操作可能なプログラムまたはバッチ ファイルとして認識されていません。
    ```
1. 以下のURLにアクセスして、Windows→x64 Installerを選択する
    https://www.oracle.com/java/technologies/downloads/#jdk18-windows
1. ダウンロードしたexeを実行してインストールする
1. 環境変数を設定する
    1. [スタートメニュー]→[Windowsシステムツール]→[コントロールパネル]→[システム]→[システムの詳細設定]から環境変数を選択する
    1. 「Path」にインストールしたJDKのURLを追加する。例えば以下のようになる。
        ```
        C:\Program Files\Java\jdk-18\bin
        ```
    1. 「JAVA_HOME」が存在しない場合は、作成する。変数値は例えば以下のようになる。
        ```
        C:\Program Files\Java\jdk-18
        ```
1. Javaがインストールできたか確認する
    ```
    java -version
    ```

- 参考URL：https://eng-entrance.com/java-install-jdk-windows

# 学んだことメモ
## 11章 継承
- 正しい継承と間違った継承
    - 「is-a の原則」に則っていることが大事
    - 子クラス is-a 親クラス ＝ 子クラスは、親クラスの一種であると言えるかどうかを考える
    - 概念としてis-aの関係がないにもかかわらず、継承を使ってしまうのは「間違った継承」
    - 例えばHouseクラスを作るときにItemクラスを継承したとして、Itemクラスに投げてダメージを与える機能を追加すると、Houseクラスにはありえないメソッドが追加されることになるため。
- クラス図の継承関係を表す矢印は「クラスが汎化していく方向」を表している。だから継承の方向（特化の方向）とは逆向きに描かれている。