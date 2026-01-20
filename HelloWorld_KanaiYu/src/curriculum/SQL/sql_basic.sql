-- 問1 
-- 全選手の以下のデータを抽出してください。
-- ・背番号（uniform_num）
-- ・名前（name）
-- ・所属クラブ（club）

-- !! SELECTはどの列を出すか　FROMはどのテーブルから出すか !!
SELECT uniform_num, name, club FROM players;

-- 問2
-- グループCに所属する国をすべて抽出してください。

-- !! *は"全て" WHEREは条件を絞り込む !!
SELECT * FROM countries WHERE group_name = 'C';

-- 問3
-- グループC以外に所属する国をすべて抽出してください。

-- !! <> は not equal !!
SELECT * FROM countries WHERE group_name <> 'C';

-- 問4
-- 現時点で40歳以上の選手を抽出してください。（誕生日の人を含めてください。）
-- 検索タイミングによって実行結果が異なります。

-- !! 生年月日 ＜＝ (４０年前の日付 !!) 今の日付 - 40年
SELECT * FROM players WHERE birth <= CURRENT_DATE - INTERVAL '40 years';

-- 問5
-- 身長が170cm未満の選手を抽出してください。
SELECT * FROM players WHERE height < 170;

-- 問6
-- FIFAランクが日本（46位）の前後10位に該当する国（36位～56位）を抽出してください。ただし、BETWEEN句を用いてください。

-- !!  BETWEEN A AND B (AとBを含む)AからBの間!!
SELECT * FROM countries WHERE ranking BETWEEN 36 AND 56;

-- 問7
-- 選手のポジションがGK、DF、MFに該当する選手をすべて抽出してください。ただし、IN句を用いてください。

-- !! IN（　）は（　）に該当するもの !!
SELECT * FROM players WHERE position IN ('GK', 'DF', 'MF');

-- 問8
-- オウンゴールとなったゴールを抽出してください。goalsテーブルのplayer_idカラムにNULLが格納されているデータがオウンゴールを表しています。

-- !! SQLでは NULL に対して = を使うことはできない !!
SELECT * FROM goals WHERE player_id IS NULL;

-- 問9
-- オウンゴール以外のゴールを抽出してください。goalsテーブルのplayer_idカラムにNULLが格納されているデータがオウンゴールを表しています。

-- !! SQLでは NULL に対して <> を使うことはできない !!
SELECT * FROM goals WHERE player_id IS NOT NULL;

-- 問10
-- 名前の末尾が「ニョ」で終わるプレイヤーを抽出してください。

-- !! LIKE '%ニョ' ～ニョみたいな！ってイメージ
SELECT * FROM players WHERE name LIKE '%ニョ';
-- 問11
-- 名前の中に「ニョ」が含まれるプレイヤーを抽出してください。

-- !! '%ニョ%' ～ニョ～
SELECT * FROM players WHERE name LIKE '%ニョ%';

-- 問12
-- 全選手の中から小柄な選手（身長が165cm未満か、体重が60kg未満）を抽出してください。

SELECT * FROM players WHERE height < 165 OR weight < 60;

-- 問13
-- FWかMFの中で170未満の選手を抽出してください。ただし、ORとANDを使用してください。

SELECT * FROM players 
WHERE (position = 'FW' OR position = 'MF') AND height < 170;

-- 問14
-- ポジションの一覧を重複なしで表示してください。グループ化は使用しないでください。

-- !! DISTINCT(はっきり異なる,別々の) 検索結果から重複（ダブり）をなくす !!

SELECT DISTINCT position FROM players;

-- 問15
-- 全選手の身長と体重を足した値をカラム名「体力指数」として表示してください。合わせて選手の名前、選手の所属クラブも表示してください。

-- !! ASでカラム名を設定
SELECT name, club, (height + weight) AS 体力指数 
FROM players;

-- 問16
-- 全ての選手を身長の大きい順に表示してください。同じ身長の選手は体重の重い順に表示してください。

--ORDER BY  [ASC 昇順 (Ascending) | DESC 降順 (Descending)]
SELECT * FROM players ORDER BY height DESC, weight DESC;

-- 問17
-- 全てのゴール情報を出力してください。ただし、オウンゴール（player_idがNULLのデータ）はCASE関数を使用してplayer_idを「9999」と表示してください。

--CASE WHEN AAA （=?? | IS NULL） THEN BBB ELSE … END //AS --- は、AAAが()のときBBBとし、その他…//これを---とする
SELECT CASE WHEN player_id IS NULL THEN 9999 ELSE player_id END AS player_id, goal_time 
FROM goals;

-- 問18
-- 全ての選手の平均身長、平均体重を表示してください。

SELECT AVG(height), AVG(weight) 
FROM players;

-- 問19
-- 日本の選手（player_idが714から736）が上げたゴール数を表示してください。

--COUNT(*)はNULLも含め行を数える / COUNT(列名)は列名に値が入っている行を数える

SELECT COUNT(*) 
FROM goals 
WHERE player_id BETWEEN 714 AND 736;

-- 問20
-- 全ての選手の中で最も高い身長と、最も軽い体重を表示してください。

SELECT MAX(height), MIN(weight) 
FROM players;

-- 問21
-- CグループのFIFAランクの合計値を表示してください。

SELECT SUM(ranking) 
FROM countries 
WHERE group_name = 'C';

-- 問22
-- 全ての試合の国名と選手名、得点時間を表示してください。オウンゴール（player_idがNULL）は表示しないでください。

-- テーブル名 （AS）別名    /  テーブルの別名.カラム名
-- goals テーブルの player_id（誰が点を入れたか）と、players テーブルの id をマッチ

SELECT c.name, p.name, g.goal_time
FROM goals g 
JOIN players p ON g.player_id = p.id 
JOIN countries c ON p.country_id = c.id;

-- 問23
-- 全ての試合のゴール時間と選手名を表示してください。左側外部結合を使用してオウンゴール（player_idがNULL）も表示してください。

--LEFT JOIN（左結合）:FROM のすぐ横に書いたテーブル（左側）を主役に 左側のテーブルにあるデータはすべて表示
SELECT g.goal_time, p.uniform_num, p.position, p.name 
FROM goals g 
LEFT JOIN players p ON g.player_id = p.id;

-- 問24
-- 全ての試合のゴール時間と選手名を表示してください。右側外部結合を使用してオウンゴール（player_idがNULL）も表示してください。

--RIGHT JOIN（右結合）JOIN の後ろに書いたテーブル（右側）を主役に 右側のテーブルのデータをすべて表示
SELECT g.goal_time, p.uniform_num, p.position, p.name
FROM players p
RIGHT JOIN goals g ON p.id = g.player_id;


-- 問25
-- 全ての試合のゴール時間と選手名、国名を表示してください。また、オウンゴール（player_idがNULL）も表示してください。
SELECT c.name, g.goal_time, p.position, p.name 
FROM goals g 
LEFT JOIN players p ON g.player_id = p.id 
LEFT JOIN countries c ON p.country_id = c.id;

-- 問26
-- 全てのゴール時間と得点を上げたプレイヤー名を表示してください。オウンゴールは表示しないでください。ただし、結合は使わずに副問合せを用いてください。

--マトリョーシカのイメージ
SELECT id, goal_time, ( SELECT name FROM players WHERE id = g.player_id) AS name 
FROM goals g
WHERE player_id IS NOT NULL;

-- 問27
-- 各ポジションごと（GK、FWなど）に最も身長と、その選手名、所属クラブを表示してください。ただし、FROM句に副問合せを使用してください。

-- １度サブテーブルとしてポジションごとの最高身長リストをつくってからJOINにてplayersとくっつける
SELECT p.position, p.height, p.name, p.club
FROM players p
JOIN( SELECT position, MAX(height) AS 最大身長 FROM players GROUP BY position) AS sub
ON p.position = sub.position AND p.height = sub.max_height;

-- 問28
-- 各グループの最上位と最下位を表示し、その差が50より大きいグループを抽出してください。

SELECT group_name, MAX(ranking), MIN(ranking)
FROM countries
GROUP BY group_name
HAVING ( MAX(ranking) - MIN(ranking)) > 50;

-- 問29
-- 1980年生まれと、1981年生まれの選手が何人いるか調べてください。ただし、日付関数は使用せず、UNION句を使用してください。


-- UNION 「集合A」と「集合B」を合わせて、1つの大きな集合を作るイメージ
-- 1980年生まれ  birth::textで文字列にすることで1980.??.??を認識できる
--'1980' AS 誕生年 見出しを作る
SELECT '1980' AS 誕生年, COUNT(id) 
FROM players WHERE birth::text LIKE '1980%'
UNION
-- 1981年生まれ  birth::textで文字列にすることで1981.??.??を認識できる
SELECT '1981' AS 誕生年, COUNT(id)  FROM players WHERE birth::text LIKE '1981%';

-- 問30
-- 身長が195㎝より大きいか、体重が95kgより大きい選手を抽出してください。
-- ただし、以下の画像のように、どちらの条件にも合致する場合には2件分のデータとして抽出してください。また、結果はidの昇順としてください。

-- 「両方に当てはまる場合は2回出す」場合はOR ではなく UNION ALL

SELECT * FROM players WHERE height > 195
UNION ALL
SELECT * FROM players WHERE weight > 95
ORDER BY id;

-- 問31
-- 身長の高い選手6位～20位を抽出し、以下の項目を表示してください。
-- ※身長が同じ選手がいる場合、同じ身長の中でも名前の順番(昇順)に並び替えてください。
-- ・名前
-- ・身長
-- ・体重

-- LIMIT 15：そこから15件だけ取得する / OFFSET 5：最初の5件を飛ばす
SELECT name, height, weight
FROM players
ORDER BY height DESC, name ASC 
LIMIT 15 OFFSET 5;


-- 問32
-- グループCの各対戦毎にゴール数を表示してください。
-- ゴール数がゼロの場合も表示してください。副問合せは使わずに、外部結合だけを使用して下さい。
-- 表示するカラム
-- ・キックオフ日時
-- ・自国名
-- ・対戦相手国名
-- ・自国FIFAランク
-- ・対戦相手国FIFAランク
-- ・自国のゴール数
-- ソート順
-- ・キックオフ日時
-- ・自国FIFAランク

--「得点が0（記録がない）」の試合も消さずに表示する →LEFT JOIN
SELECT m.kickoff, name AS my_country,c2.name AS enemy_country, c1.ranking AS my_ranking, c2.ranking AS enemy_ranking, COUNT(g.id) AS my_goals
FROM pairings m
JOIN countries c1 ON m.my_country_id = c1.id
JOIN countries c2 ON m.enemy_country_id = c2.id
LEFT JOIN goals g ON m.id = g.pairing_id
WHERE c1.group_name = 'C'
GROUP BY m.id, c1.name, c2.name, c1.ranking, c2.ranking
ORDER BY m.kickoff, c1.ranking;


-- 問33
-- グループCの各対戦毎にゴール数を表示してください。
-- ゴール数がゼロの場合も表示してください。自国のゴール数は副問合せを用いて表示してください。
-- 表示するカラム
-- ・キックオフ日時
-- ・自国名
-- ・対戦相手国名
-- ・自国FIFAランク
-- ・対戦相手国FIFAランク
-- ・自国のゴール数
-- ソート順
-- ・キックオフ日時
-- ・自国FIFAランク

SELECT m.kickoff, c1.name AS my_country, c2.name AS enemy_contry, c1.ranking AS my_ranking, c2.ranking AS enemy_ranking,
       (SELECT COUNT(g.id) FROM goals g WHERE g.pairing_id = m.id) AS my_goals
FROM pairings m
JOIN countries c1 ON m.my_country_id = c1.id
JOIN countries c2 ON m.enemy_country_id = c2.id
WHERE c1.group_name = 'C'
ORDER BY m.kickoff, c1.ranking;

