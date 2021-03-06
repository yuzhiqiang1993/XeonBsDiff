package com.xeon.xeonbsdiff

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.xeon.xeonbsdiff.databinding.ActivityMainBinding

/**
 * @description: MainActiviy
 * @author : yuzhiqiang (zhiqiang.yu.xeon@gmail.com)
 * @date   : 2021/11/17
 * @time   : 21:46
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val vm by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*生成补丁包*/
        binding.btnDiff.setOnClickListener {
            vm.fileDiff()
        }

        /*合并文件*/
        binding.btnPatch.setOnClickListener {
            vm.filePatch()
        }

    }


}