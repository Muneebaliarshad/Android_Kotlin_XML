import com.example.android_kotlin_xml.R

data class ItemsList(
    var title: String,
    var imageResId: Int
)

object Supplier {

    val listData = listOf(
        ItemsList("iOS", R.drawable.ios),
        ItemsList("Android", R.drawable.android),
        ItemsList("Flutter", R.drawable.flutter),
        ItemsList("React Native", R.drawable.react_native)
    )
}