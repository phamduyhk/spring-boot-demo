

category = "野菜"
names = ["トマト", "ナス", "ピーマン", "きゅうり", "ズッキーニ", "オクラ", "とうもろこし", "バジル", "しそ", "モロヘイヤ", "さやエンドウ", "そら豆", "枝豆", "かぼちゃ", "人参", "ジャガイモ", "玉ねぎ", "大根", "ネギ", "ごぼう", "里芋", "キャベツ", "レタス", "白菜", "ブロッコリー", "ほうれん草", "小松菜", "かぶ", "季節の野菜詰め合わせセット"]
for number in range(len(names)):
    print(f"INSERT INTO PRODUCT(PRODUCT_ID,PRODUCT_NAME ,PRODUCT_DETAIL,CATEGORY,PRICE) VALUES({number+1}, '{names[number]}', '{names[number]}', '{category}', 1200);")

count = len(names)
print()
category = "果物"
names = ["りんご", "なし", "ぶどう", "みかん", "いちご", "もも", "さくらんぼ", "スイカ", "アンズ", "プラム"]
for number in range(len(names)):
    print(f"INSERT INTO PRODUCT(PRODUCT_ID,PRODUCT_NAME ,PRODUCT_DETAIL,CATEGORY,PRICE) VALUES({number+count+1}, '{names[number]}', '{names[number]}', '{category}', 1200);")