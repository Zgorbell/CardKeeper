import com.example.entity.Card
import com.example.entity.GiftProvider
import com.example.remote.model.GiftCard
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Provider {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("title")
    @Expose
    var title: String? = null
    @SerializedName("image_url")
    @Expose
    var imageUrl: String? = null
    @SerializedName("gift_cards")
    @Expose
    var giftCards: List<GiftCard>? = null

    fun toDomain(): GiftProvider{
        val cards = giftCards?.map { it.toDomain() } ?: ArrayList()
        return GiftProvider(cards, title)
    }
}