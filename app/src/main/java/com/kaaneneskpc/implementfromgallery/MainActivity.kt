package com.kaaneneskpc.implementfromgallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kaaneneskpc.implementfromgallery.component.HorizontalPagerComponent
import com.kaaneneskpc.implementfromgallery.ui.theme.ImplementFromGalleryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImplementFromGalleryTheme {
                val images = remember {
                    mutableStateListOf(
                        "https://images.pexels.com/photos/17354530/pexels-photo-17354530/free-photo-of-deniz-plaj-kum-cimen.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                        "https://images.pexels.com/photos/27203450/pexels-photo-27203450/free-photo-of-kent-sehir-tatil-sokak.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                        "https://images.pexels.com/photos/27219299/pexels-photo-27219299/free-photo-of-deniz-plaj-tatil-kum.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                        "https://images.pexels.com/photos/27245743/pexels-photo-27245743/free-photo-of-peyzaj-manzara-kent-simgesi-gorulecek-yer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                        "https://images.pexels.com/photos/23695268/pexels-photo-23695268/free-photo-of-kahve-bardak-kadeh-cam.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                        "https://images.pexels.com/photos/20780459/pexels-photo-20780459/free-photo-of-kent-sehir-gun-batimi-kent-simgesi.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                        "https://images.pexels.com/photos/27008964/pexels-photo-27008964/free-photo-of-a-tree-is-sitting-on-the-shore-of-a-lake.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                        "https://images.pexels.com/photos/27519587/pexels-photo-27519587/free-photo-of-a-building-with-a-blue-sky-and-a-white-roof.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                        "https://images.pexels.com/photos/24017562/pexels-photo-24017562/free-photo-of-purple-blossoms-on-tree.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                        "https://images.pexels.com/photos/20638298/pexels-photo-20638298/free-photo-of-green-fern-plant-with-twisted-leaves.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
                    )
                }
                HorizontalPagerComponent(images = images)
            }
        }
    }
}