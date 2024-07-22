package com.example.kmpapp.android.mainScreen

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kmpapp.android.R
import com.example.kmpapp.android.ui.MyApplicationTheme

@Composable
internal fun MainUI() {
    var checked by remember { mutableStateOf(true) }
    Column(
        modifier = Modifier
            .padding(horizontal = 0.dp, vertical = dimensionResource(id = R.dimen.small_padding))
            .border(width = 2.dp, color = Color.Green)
    ) {
        Row(
            modifier = Modifier
                .padding(vertical = dimensionResource(id = R.dimen.small_padding))
        ) {
            Checkbox(
                checked = checked,
                onCheckedChange = { checked = it },
                modifier = Modifier
                    .padding(all = 12.dp)
            )
            Text(
                text = "Minimal checkbox",
                modifier = Modifier
                    .padding(
                        top = dimensionResource(id = R.dimen.normal_padding),
                        end = dimensionResource(id = R.dimen.small_padding),
                        bottom = dimensionResource(id = R.dimen.small_padding)
                    ),
            )
        }
        Text(
            text = stringResource(id = if (checked) R.string.checked else R.string.unchecked),
            modifier = Modifier
                .padding(
                    start = dimensionResource(id = R.dimen.normal_padding),
                    bottom = dimensionResource(id = R.dimen.normal_padding),
                )
        )
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun MainUIPreview() {
    MyApplicationTheme {
        MainUI()
    }
}