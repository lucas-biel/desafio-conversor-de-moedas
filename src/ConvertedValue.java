import com.google.gson.annotations.SerializedName;

public record ConvertedValue(
        @SerializedName("base_code") String baseCurrency,
        @SerializedName("target_code") String targetCurrency,
        @SerializedName("conversion_rate") float conversionRate,
        @SerializedName("conversion_result") float amount
) {
}
