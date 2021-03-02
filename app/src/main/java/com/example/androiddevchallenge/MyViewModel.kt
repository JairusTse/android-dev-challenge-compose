/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Dog

class MyViewModel : ViewModel() {

    val dogs = mutableListOf(
        Dog(
            2, "德国牧羊犬", "这是一条德国牧羊犬",
            "德国牧羊犬（德语：Deutscher Schäferhund；英语：German Shepherd），是狗的一个品种，1977年才正式确定命名为德国牧羊犬[1]，故各地命名迥异，中文语境下常称为德国狼犬[2]或德国狼狗。德国牧羊犬在所有犬类的智商排名中排行第三。[来源请求]它们敏捷且适合活动的工作环境，经常被部署各种任务，例如警察、护卫、搜索及拯援和军事，它们也为盲者做导盲犬的工作；因台湾在日治时期大量使用德国牧羊犬为军犬，所以德国牧羊犬在台湾使用的闽南语名称为“军用犬”。\n" +
                "\n" +
                "德国牧羊犬原产于德国。于1880年，德国牧羊犬已经在德国各地固定下来，并作为牧羊犬使用。在第一次世界大战期间被德军募集，作为军犬随军。由德军取长补短培育后，基本定型。因为体型高大，外观威猛，并且具备极强的工作能力，因此在世界多处范围以警犬、搜救犬、导盲犬、牧羊犬、观赏犬以及家养宠物犬等身份活跃。\n" +
                "\n" +
                "目前常见的德国牧羊犬有经过进一步改良的“西德德牧”以及较为原始的“东德德牧”。两者体型有显著区别，“西德德牧”为加强其观赏性，因此背部背弓弧度较“东德德牧”大。通常比较常见的为“西德德牧”。",
            R.mipmap.dog_2, R.mipmap.dog_b_2
        ),
        Dog(
            3, "斗牛犬", "这是一条斗牛犬",
            "斗牛犬（英语：Bulldog）系一种哺乳类动物，系一中型犬种，又名老虎狗、牛头犬，斗牛犬一词通常被用来称呼英国斗牛犬（English Bulldog 或 British Bulldog），其余斗牛犬种包含美国斗牛犬（American Bulldog）、古英国斗牛犬（Old English Bulldog）、勒维特斗牛犬（Leavitt Bulldog）、复刻版英国斗牛犬（Olde English Bulldogge）以及法国斗牛犬（French Bulldog）等。\n" +
                "\n" +
                "\n" +
                "勒维特斗牛犬\n" +
                "其中古英国斗牛犬因斗牛活动被禁止后已经灭绝；复刻版英国斗牛犬则系由育种者于近四十余年前起针对斗牛犬过多遗传疾病改良之品种，其外貌与古英国斗牛犬近似，然性情温和友善且健康状况远优于斗牛犬；而勒维特斗牛犬与复刻版英国斗牛犬皆属育种者大卫·勒维特（David Leavitt）之杰作，但他认为复刻版的后代中多数已经逐渐流失了他当初培育的品质，所以另外以自己的姓氏命名之，其血统组成包含1/2的英国斗牛犬、1/6的美国斗牛犬、1/6的比特犬（American Pit Bull Terrier）以及1/6的斗牛獒犬（Bullmastiff）。",
            R.mipmap.dog_3, R.mipmap.dog_b_3
        ),
        Dog(
            4, "贵宾犬", "这是一条贵宾犬",
            "法国的长卷毛犬、匈牙利的水猎犬、葡萄牙水犬、爱尔兰水犬、西班牙猎犬，甚至马尔济斯犬，都有可能是贵宾犬的祖先。\n" +
                "贵宾犬在法国被视为国犬，很多人认为贵宾犬原产于法国，但许多国家仍对贵宾犬的起源争执不休，都想把它据为己有。德国、前苏联、意大利等国均各抒己见，认为有些品种的贵宾犬产于他们的国家，如白毛品种以法国居多，棕毛品种多产于德国，黑毛品种以前苏联为多，茶褐色品种则以意大利为多。有些史学家深信，德国、前苏联、法国在贵宾犬的发展过程中，均扮演过极其重要的角色 [1]  。贵宾犬起源于欧洲，具体是哪个国家还有争议。贵宾犬以水中捕猎而著称，是水猎犬。但是只有标准贵宾具有工作能力。它是聪明而善解人意的犬种。多年以来，它一直被认为是法国的国犬。贵宾犬根据体型大小被AKC标准分为标准型，迷你型，玩具型三种。而FCI把它们分为大型，中型，迷你型，玩具型四种。贵宾犬气质独特，造型多变，赢得了许多人的欢心，给人一种漂亮的、聪明的印象。值得注意的是，并没有泰迪这个品种的犬，泰迪不是犬种，它只是贵宾犬众多美容造型中的一种的名称。",
            R.mipmap.dog_4, R.mipmap.dog_b_4
        ),
        Dog(5, "拉布拉多", "这是一条拉布拉多", "拉布拉多犬或称拉布拉多拾猎犬（简称拉布拉多；英语：Labrador Retriever）是一种中大型犬类，天生个性温和、活泼、没有攻击性和智商高，是适合被选作导盲犬或其他工作犬的狗品种，跟黄金猎犬、哈士奇并列三大低攻击性犬类之一。在美国犬业俱乐部中拉布拉多是目前登记数量最多的品种。", R.mipmap.dog_5, R.mipmap.dog_b_5),
        Dog(
            6, "哈士奇", "这是一条哈士奇",
            "西伯利亚哈士奇（俄语：Сибирский хаски，Sibirskiy haski，英语：Siberian husky）是一种原产于西伯利亚东部的工作犬，常见别名哈士奇。西伯利亚哈士奇体重介于25～55磅(16～27kg)之间，身高大约20～23.5英寸(51～60cm)，是一种中型犬。\n" +
                "\n" +
                "由于有着能在北极严寒环境中繁衍生息的能力，西伯利亚哈士奇是一种适应力很强的犬种。它们最早是由西伯利亚东部的楚科奇族部落居民饲养，用于狩猎驯鹿，拖曳雪橇或者照顾幼儿使孩子们远离寒冷。",
            R.mipmap.dog_6, R.mipmap.dog_b_6
        ),
        Dog(7, "吉娃娃", "这是一条吉娃娃", "吉娃娃犬以细小的体型、大眼睛、特别大的耳朵和直竖的尾巴为特征。美国犬业俱乐部仅承认一种吉娃娃犬，但其实此犬种有许多型态、花色和长短毛之分。以长短毛来分，可分为短毛与长毛，短毛是我们目前较常见的，而长毛吉娃娃身上的毛光泽且柔软，后肢肌肉较发达。生性懦弱且对冷很敏感，喜欢热，爱晒太阳。长毛种耳朵、四肢、尾巴皆有装饰毛，但长度并未拖地，在花色方面，墨西哥地区以前以黑色品种居多，不过现在毛色已呈多样化，包括奶油色、红色、褐色、黑色中掺有黄褐色、各种混色。另外它们的重量介于1至5公斤之间，美国犬业俱乐部不认可超过3公斤的吉娃娃犬。", R.mipmap.dog_7, R.mipmap.dog_b_7),
        Dog(8, "腊肠犬", "这是一条腊肠犬", "腊肠犬（Dachshund）是一种短腿，长身的猎犬。其名源于德国，原意\"獾狗\"。此品种被发展为嗅猎，追踪，及捕杀獾类及其他穴居的动物。有意思的是，虽然\"Dachshund\"是一个德语单词，但是它在德国并不常用，德国人通常叫它Dackel或Teckel。原产于德国，现遍及各地。腊肠犬在所有狗种中是比较好养的。因为腊肠犬的天性独立自主，所以照顾起来很容易，主人下达的指令也都会迅速理解遵从。", R.mipmap.dog_8, R.mipmap.dog_b_8),
        Dog(9, "法国斗牛犬", "这是一条法国斗牛犬", "法国斗牛犬（French Bulldog）原产于法国，为英国斗牛犬的子孙，从19世纪中期由法国人从英国帯到法国后，改良为今日的品种。此类犬的性状已远远优于英国斗牛犬，为家庭犬，体型短小，躯体沉厚，头部短而巨大，下颌突出，肩宽，四肢强壮而矮小，眼圆、大而凸，耳直立且大，被毛短而密，光滑而有光泽，体呈黑色，斑为白色，或白底黑斑。体高30cm，体重12kg，步伐沉稳，性格稳重、温和，反应机敏 [2]  。", R.mipmap.dog_9, R.mipmap.dog_b_9),
        Dog(
            10, "大丹犬", "这是一条大丹犬",
            "大丹犬（Great Dane）原产于德国，历史上曾用做猎犬、护卫犬、斗犬、使役犬等，因其性格温顺、外貌优美，现今的发展方向主要是家庭用犬 [1]  。\\n\" +\n" +
                "                \"该品种外貌高大、优美，体高与体长相当。公犬体高在76cm以上，母犬体高在71cm以上，被毛短而贴身，平滑而有光泽。毛色有淡黄褐色、虎纹色、黑色、蓝色、花色等几种 [1]  。",
            R.mipmap.dog_10, R.mipmap.dog_b_10
        ),
        Dog(11, "博美", "这是一条博美", "博美犬（英语：Pomeranian）是狐狸犬家族中最小的犬种，其名出自原产地波美拉尼亚，在波兰西北部和德国东北部沿海交界地。博美犬因娇小的体型而归类为玩赏犬类。", R.mipmap.dog_11, R.mipmap.dog_b_11),
        Dog(2, "西施犬", "这是一条博美", "", R.mipmap.dog_12, R.mipmap.dog_b_12),
        Dog(3, "柯基犬", "这是一条柯基犬", "", R.mipmap.dog_13, R.mipmap.dog_b_13),
        Dog(4, "边牧犬", "这是一条边牧犬", "", R.mipmap.dog_14, R.mipmap.dog_b_14),
        Dog(5, "萨摩耶", "这是一条萨摩耶", "", R.mipmap.dog_15, R.mipmap.dog_b_15),
        Dog(6, "沙皮狗", "这是一条沙皮狗", "", R.mipmap.dog_16, R.mipmap.dog_b_16),
        Dog(7, "秋田犬", "这是一条秋田犬", "", R.mipmap.dog_17, R.mipmap.dog_b_1),
        Dog(8, "柴犬", "这是一条柴犬", "", R.mipmap.dog_18, R.mipmap.dog_b_1),
        Dog(9, "中华田园犬", "这是一条中华田园犬", "", R.mipmap.dog_19, R.mipmap.dog_b_1),
        Dog(10, "沙皮狗", "这是一条沙皮狗", "", R.mipmap.dog_20, R.mipmap.dog_b_1),
        Dog(11, "藏獒", "这是一条藏獒", "", R.mipmap.dog_2, R.mipmap.dog_b_1)
    )

    var isShowDetail by mutableStateOf(false)
    var index by mutableStateOf(0)

    fun showDetail() {
        isShowDetail = true
        Log.i("jairus", "showDetail.isShowDetail.value = " + isShowDetail)
    }

    fun hideDetail() {
        isShowDetail = false
        Log.i("jairus", "hideDetail.isShowDetail.value = " + isShowDetail)
    }
}
