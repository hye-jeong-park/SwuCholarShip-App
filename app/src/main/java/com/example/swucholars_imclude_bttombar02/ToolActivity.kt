package com.example.swucholars_imclude_bttombar02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Adapter
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.swucholars_imclude_bttombar02.fragment_bottombar.*
import com.example.swucholars_imclude_bttombar02.fragment_drawer.InsideFragment
import com.example.swucholars_imclude_bttombar02.fragment_drawer.NationFragment
import com.example.swucholars_imclude_bttombar02.fragment_drawer.OutsideFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

open class ToolActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener, BottomNavigationView.OnNavigationItemSelectedListener
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById<Toolbar>(R.id.main_toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true) // 드로어를 꺼낼 홈 버튼 활성화
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_hambuger) // 홈버튼 이미지 변경
        supportActionBar?.setDisplayShowTitleEnabled(false) // 툴바에 타이틀 안보이게

        val main_navigationView = findViewById<NavigationView>(R.id.main_navigationView)
        main_navigationView.setNavigationItemSelectedListener(this) //navigation 리스너
        val bottom_navigation=findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottom_navigation.setOnNavigationItemSelectedListener(this)


        setViewPager()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val main_drawer_layout = findViewById<DrawerLayout>(R.id.main_drawer_layout)
        when(item.itemId){
            android.R.id.home->{ // 메뉴 버튼
                main_drawer_layout.openDrawer(GravityCompat.START)    // 네비게이션 드로어 열기
            }
        }
        return super.onOptionsItemSelected(item)
    }

    //상단 드로어레이아웃의 네비게이션뷰와 프레그먼트 연결
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val main_drawer_layout = findViewById<DrawerLayout>(R.id.main_drawer_layout)

        when(item.itemId){
            R.id.inside -> {
                Toast.makeText(this,"교내장학금으로 넘어갑니다",Toast.LENGTH_LONG).show()
                main_drawer_layout.closeDrawer(GravityCompat.START)
                //페이지 넘어갈 action기입
                movePager(0)
            }
            R.id.outside -> {
                Toast.makeText(this,"교외장학금으로 넘어갑니다",Toast.LENGTH_LONG).show()
                main_drawer_layout.closeDrawer(GravityCompat.START)
                //페이지 넘어갈 action기입
                movePager(1)
            }
            R.id.nation -> {
                Toast.makeText(this,"국가장학금으로 넘어갑니다",Toast.LENGTH_LONG).show()
                main_drawer_layout.closeDrawer(GravityCompat.START)
                //페이지 넘어갈 action기입
                movePager(2)
            }
            R.id.home -> {
                Toast.makeText(this,"홈으로 넘어갑니다",Toast.LENGTH_LONG).show()
                //페이지 넘어갈 action기입
                movePager(3)
            }
            R.id.info -> {
                Toast.makeText(this,"장학정보로 넘어갑니다",Toast.LENGTH_LONG).show()
                //페이지 넘어갈 action기입
                movePager(4)
            }
            R.id.alarm -> {
                Toast.makeText(this,"알람으로 넘어갑니다",Toast.LENGTH_LONG).show()
                //페이지 넘어갈 action기입
                movePager(5)
            }
            R.id.mypage -> {
                Toast.makeText(this,"마이페이지로 넘어갑니다",Toast.LENGTH_LONG).show()
                //페이지 넘어갈 action기입
                movePager(6)
            }
            R.id.star -> {
                Toast.makeText(this,"즐겨찾기로 넘어갑니다",Toast.LENGTH_LONG).show()
                //페이지 넘어갈 action기입
                movePager(7)
            }
        }
        return true
    }

    private fun movePager(index:Int){
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        viewPager.currentItem = index
    }

    private fun setViewPager(){
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val fragmentList = listOf(InsideFragment(),OutsideFragment(),NationFragment(),
        HomeFragment(), InfoFragment(), AlarmFragment(), MypageFragment(), StarFragment())
        val adapter = DrawerFragmentStatePagerAdapter(this)
        adapter.fragmentList = fragmentList
        viewPager.adapter = adapter
    }


    override fun onBackPressed() {//드로어가 나와있을때 뒤로가기 버튼에 대한 이벤트를 처리
        val main_drawer = findViewById<DrawerLayout>(R.id.main_drawer_layout)
        if(main_drawer.isDrawerOpen(GravityCompat.START)){
            main_drawer.closeDrawers()
        } else{
            super.onBackPressed()
        }
    }

}



