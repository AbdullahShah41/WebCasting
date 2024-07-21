import{_ as W}from"./LeftSidebar.vuevuetypescriptsetuptruelang-xn7lCt7t.js";import{_ as X}from"./TagFilter.vuevuetypescriptsetuptruelang-CUu0usUl.js";import{d as N,g as Y,u as U,h as y,aM as Z,l as ee,C as te,b3 as se,af as x,a1 as T,ag as F,o as u,c as h,P as ae,w as A,m as g,N as b,a as d,t as p,O as oe,i as M,s as V,I as ne,aH as O,K as ie,J as i,k as re,S as le,v as L,q as I,V as ce,e as $,aQ as ue,aR as pe,x as de,p as S,a6 as Q,a0 as _e,a7 as me,f as R,a8 as ve,aP as he}from"./index-BzaaAwnX.js";import{u as fe}from"./search-DwB6FdxH.js";const ye=["onClick"],ge={class:"title"},Te={class:"count"},qe=N({__name:"BucketFilter",props:{type:{type:String,required:!0},selected:{type:String,required:!0}},setup(_){const m=_,{t:q}=Y(),t=U(),f=y([]),{view:s}=Z(m.type),{refetch:k}=ee({handle:(o,l)=>{l?te(q(l),"error"):o&&(f.value=o.mediaBuckets)},document:se,variables:{type:m.type},appApi:!0}),r=o=>{o.type===m.type&&k()};return x(()=>{T.on("media_items_actioned",r)}),F(()=>{T.off("media_items_actioned",r)}),(o,l)=>(u(!0),h(oe,null,ae(f.value,a=>(u(),h("li",{key:a.id,onClick:A(v=>g(s)(g(t),a.id),["prevent"]),class:b({active:_.selected&&a.id===_.selected})},[d("span",ge,p(a.name),1),d("span",Te,p(a.itemCount.toLocaleString()),1)],10,ye))),128))}}),ke={viewBox:"0 0 24 24",width:"1.2em",height:"1.2em"},Ie=d("path",{fill:"currentColor",d:"M11.95 18q.525 0 .888-.363t.362-.887t-.362-.888t-.888-.362t-.887.363t-.363.887t.363.888t.887.362m.05 4q-2.075 0-3.9-.788t-3.175-2.137T2.788 15.9T2 12t.788-3.9t2.137-3.175T8.1 2.788T12 2t3.9.788t3.175 2.137T21.213 8.1T22 12t-.788 3.9t-2.137 3.175t-3.175 2.138T12 22m0-2q3.35 0 5.675-2.325T20 12t-2.325-5.675T12 4T6.325 6.325T4 12t2.325 5.675T12 20m.1-12.3q.625 0 1.088.4t.462 1q0 .55-.337.975t-.763.8q-.575.5-1.012 1.1t-.438 1.35q0 .35.263.588t.612.237q.375 0 .638-.25t.337-.625q.1-.525.45-.937t.75-.788q.575-.55.988-1.2t.412-1.45q0-1.275-1.037-2.087T12.1 6q-.95 0-1.812.4T8.975 7.625q-.175.3-.112.638t.337.512q.35.2.725.125t.625-.425q.275-.375.688-.575t.862-.2"},null,-1),$e=[Ie];function Se(_,m){return u(),h("svg",ke,[...$e])}const Ae={name:"material-symbols-help-outline-rounded",render:Se},be={class:"nav"},Be={class:"title"},Ce={key:0,class:"count"},De={class:"title"},we={key:0,class:"count"},Le=N({__name:"MediaSidebar",props:{type:{type:String,required:!0},gql:{type:Object,required:!0}},setup(_){const m=M(),{app:q}=V(m),t=_,f=U(),{counter:s}=V(M()),{parseQ:k}=fe(),r=ne({tagIds:[]}),o=y(""),l=y(!1),a=y(""),v=y(""),B=O(()=>{var e,c,n;return t.type===i.IMAGE?((e=s.value)==null?void 0:e.images)??-1:t.type===i.VIDEO?((c=s.value)==null?void 0:c.videos)??-1:t.type===i.AUDIO?((n=s.value)==null?void 0:n.audios)??-1:-1}),C=O(()=>{var e,c,n;return t.type===i.IMAGE?((e=s.value)==null?void 0:e.imagesTrash)??-1:t.type===i.VIDEO?((c=s.value)==null?void 0:c.videosTrash)??-1:t.type===i.AUDIO?((n=s.value)==null?void 0:n.audiosTrash)??-1:-1}),{fetch:D}=ie({handle:e=>{e&&(t.type===i.IMAGE?(s.value.images=e.total,s.value.imagesTrash=e.trash):t.type===i.VIDEO?(s.value.videos=e.total,s.value.videosTrash=e.trash):t.type===i.AUDIO&&(s.value.audios=e.total,s.value.audiosTrash=e.trash))},document:t.gql,variables:()=>({}),appApi:!0});function w(){var n;const e=Q.currentRoute.value;o.value=e.meta.group||"",D();const c=_e(((n=e.query.q)==null?void 0:n.toString())??"");k(r,c),a.value=r.tagIds.length===1?r.tagIds[0]:"",l.value=r.trash??!1,v.value=r.bucketId??"",a.value&&v.value&&(a.value=""),l.value&&(v.value="",a.value="")}w(),re(()=>Q.currentRoute.value.fullPath,()=>{w()});function G(){const e=me([{name:"trash",op:"",value:"true"}]);R(f,`/${o.value}?q=${ve(e)}`)}function H(){R(f,`/${o.value}`)}const E=e=>{e.type===t.type&&D()};return x(()=>{T.on("media_items_actioned",E)}),F(()=>{T.off("media_items_actioned",E)}),(e,c)=>{const n=Ae,P=he,z=qe,j=X,J=W,K=le("tooltip");return u(),L(J,null,{title:I(()=>[ce(p(e.$t(`page_title.${o.value}`)),1)]),body:I(()=>[d("ul",be,[d("li",{onClick:A(H,["prevent"]),class:b({active:!a.value&&!v.value&&!l.value})},[d("span",Be,p(e.$t("all")),1),B.value>=0?(u(),h("span",Ce,p(B.value.toLocaleString()),1)):$("",!0)],2),g(ue)(g(pe).MEDIA_TRASH,g(q).osVersion)?(u(),h("li",{key:0,onClick:A(G,["prevent"]),class:b({active:l.value})},[d("span",De,p(e.$t("trash")),1),de((u(),L(P,{class:"btn-help sm"},{icon:I(()=>[S(n)]),_:1})),[[K,e.$t("trash_tips")]]),C.value>=0?(u(),h("span",we,p(C.value.toLocaleString()),1)):$("",!0)],2)):$("",!0),S(z,{type:t.type,selected:v.value},null,8,["type","selected"])]),S(j,{type:t.type,selected:a.value},null,8,["type","selected"])]),_:1})}}});export{Le as _};
